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
	
	//Soru class'�ndan 5 tane objeyi tutan array olu�turduk.
	Soru[] sorular = new Soru[5];
	
	int gecerliSoru=0;
	int skor=0;
	int soruMax=3;
	
	
	//Paneli in�a ettik.
	public SoruDeneme() {
		//***Elememanlar�_
		//Olu�turma
		soruMetni = new JLabel();
		cevapRadioA = new JRadioButton();
		cevapRadioB = new JRadioButton();
		cevapRadioC = new JRadioButton();
		cevapRadioD = new JRadioButton();
		onayButton = new JButton("Son Karar�m!");
		cevaplarGrup = new ButtonGroup();
		skorLabel = new JLabel("Skor: " + skor);
		
		//Grupland�rma
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
		
		//Sorularla ilgili k�s�m
		sorular�Olustur();
		sorular�EkranaYans�t(gecerliSoru);
		
	}
	
	public void sorular�Olustur() 
	{
		//FileReader ile dosya okuyoruz.
		FileReader dosyaOkuyucu;
		//Buffered reader ile 
		BufferedReader okuyucu;
		
		try {
			//Okuyucu tan�mlamalar.
			dosyaOkuyucu = new FileReader("K:\\WORK\\deneme\\bin\\Ders51\\metin.txt") ;
			okuyucu = new BufferedReader(dosyaOkuyucu);
			
			//Okunan ifadeyi yazd�rma.Burda her defas�nda bir sat�r okudu.
			System.out.println(okuyucu.readLine());
			System.out.println(okuyucu.readLine());
			System.out.println(okuyucu.readLine());
			System.out.println(okuyucu.readLine());
			
			//Okuyucular� kapatma.
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
	
	public void sorular�EkranaYans�t(int soruNo)
	{
		//Sorular dizisinde soruNo indexindeki soruMetni stringini ilgili labele yazd�rd�k.
		soruMetni.setText(sorular[soruNo].soruMetni);
		//��klar� ekrana yazd�r�yoruz.
		cevapRadioA.setText(sorular[soruNo].secenekA);
		cevapRadioB.setText(sorular[soruNo].secenekB);
		cevapRadioC.setText(sorular[soruNo].secenekC);
		cevapRadioD.setText(sorular[soruNo].secenekD);
		
		
	}
	
	public boolean cevapKontrol(Soru.Cevap verilenCevap)
	{
		return sorular[gecerliSoru].cevapKontrol(verilenCevap);
	}

	//onayButton�na bast���m�z zaman bu metod �al���r.
	@Override
	public void actionPerformed(ActionEvent arg0) {
		boolean cevap;
		
		//Cevap Kontrol�
		if(cevapRadioA.isSelected())
		{
			//cevapKontrol metodundan true veya false de�eri d�n�p cevap boolean�na e�itlenecek.
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
		
		//Cevaba g�re i� yap
		if(cevap)
		{
		JOptionPane.showMessageDialog(this, "Do�ru bildin!");
		skor+=10;
		skorLabel.setText("Skor: " + skor);
		}
		
		else 
		{
			JOptionPane.showMessageDialog(this, "Yanl�� cevap!");
		}
		
		gecerliSoru++;
		if(gecerliSoru<soruMax)
		{	
		sorular�EkranaYans�t(gecerliSoru);
		}
		
		else 
		{
			JOptionPane.showMessageDialog(this, "Oyun bitti! Skorun: " + skor);
		}
	}

}

//  2 catchin yerine alttaki kod da yaz�labilir. ayn� �ey.
//	catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
