package Ders51;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;







public class SoruDeneme extends JPanel implements ActionListener{

	JLabel soruMetni,skorLabel;
	JRadioButton cevapRadioA,cevapRadioB,cevapRadioC,cevapRadioD;
	JButton onayButton;
	ButtonGroup cevaplarGrup;
	
	//Soru class'ýndan 5 tane objeyi tutan array oluþturduk.
	Soru[] sorular = new Soru[5];
	
	int gecerliSoru=0;
	int skor=0;
	int soruMax=3;
	
	
	//Paneli inþa ettik.
	public SoruDeneme() {
		//***Elememanlarý_
		//Oluþturma
		soruMetni = new JLabel();
		cevapRadioA = new JRadioButton();
		cevapRadioB = new JRadioButton();
		cevapRadioC = new JRadioButton();
		cevapRadioD = new JRadioButton();
		onayButton = new JButton("Son Kararým!");
		cevaplarGrup = new ButtonGroup();
		skorLabel = new JLabel("Skor: " + skor);
		
		//Gruplandýrma
		cevaplarGrup.add(cevapRadioA);
		cevaplarGrup.add(cevapRadioB);
		cevaplarGrup.add(cevapRadioC);
		cevaplarGrup.add(cevapRadioD);
		
		//Ekleme
		onayButton.addActionListener(this);
		add(soruMetni);
		add(cevapRadioA);
		add(cevapRadioB);
		add(cevapRadioC);
		add(cevapRadioD);
		add(onayButton);
		add(skorLabel);
		
		//Sorularla ilgili kýsým
		sorularýOlustur();
		sorularýEkranaYansýt(gecerliSoru);
		
	}
	
	public void sorularýOlustur() 
	{
		//FileReader ile dosya okuyoruz.
		FileReader dosyaOkuyucu;
		//Buffered reader ile 
		BufferedReader okuyucu;
		
		try {
			//Okuyucu tanýmlamalar.
			dosyaOkuyucu = new FileReader("K:\\WORK\\deneme\\bin\\Ders51\\metin.txt") ;
			okuyucu = new BufferedReader(dosyaOkuyucu);
			
			//Okunan ifadeyi yazdýrma.Burda her defasýnda bir satýr okudu.
			System.out.println(okuyucu.readLine());
			System.out.println(okuyucu.readLine());
			System.out.println(okuyucu.readLine());
			System.out.println(okuyucu.readLine());
			
			//Okuyucularý kapatma.
			dosyaOkuyucu.close();
			okuyucu.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sorularýEkranaYansýt(int soruNo)
	{
		//Sorular dizisinde soruNo indexindeki soruMetni stringini ilgili labele yazdýrdýk.
		soruMetni.setText(sorular[soruNo].soruMetni);
		//Þýklarý ekrana yazdýrýyoruz.
		cevapRadioA.setText(sorular[soruNo].secenekA);
		cevapRadioB.setText(sorular[soruNo].secenekB);
		cevapRadioC.setText(sorular[soruNo].secenekC);
		cevapRadioD.setText(sorular[soruNo].secenekD);
		
		
	}
	
	public boolean cevapKontrol(Soru.Cevap verilenCevap)
	{
		return sorular[gecerliSoru].cevapKontrol(verilenCevap);
	}

	//onayButtonýna bastýðýmýz zaman bu metod çalýþýr.
	@Override
	public void actionPerformed(ActionEvent arg0) {
		boolean cevap;
		
		//Cevap Kontrolü
		if(cevapRadioA.isSelected())
		{
			//cevapKontrol metodundan true veya false deðeri dönüp cevap booleanýna eþitlenecek.
			cevap =  cevapKontrol(Soru.Cevap.CEVAP_A);
		}
		else if(cevapRadioB.isSelected())
		{
			cevap =  cevapKontrol(Soru.Cevap.CEVAP_B);
		}
		else if(cevapRadioC.isSelected())
		{
			cevap =  cevapKontrol(Soru.Cevap.CEVAP_C);	
		}
		else if(cevapRadioD.isSelected())
		{
			cevap =  cevapKontrol(Soru.Cevap.CEVAP_D);
		}
		else 
		{
			cevap = false;
		}
		
		//Cevaba göre iþ yap
		if(cevap)
		{
		JOptionPane.showMessageDialog(this, "Doðru bildin!");
		skor+=10;
		skorLabel.setText("Skor: " + skor);
		}
		
		else 
		{
			JOptionPane.showMessageDialog(this, "Yanlýþ cevap!");
		}
		
		gecerliSoru++;
		if(gecerliSoru<soruMax)
		{	
		sorularýEkranaYansýt(gecerliSoru);
		}
		
		else 
		{
			JOptionPane.showMessageDialog(this, "Oyun bitti! Skorun: " + skor);
		}
	}

}

//  2 catchin yerine alttaki kod da yazýlabilir. ayný þey.
//	catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
