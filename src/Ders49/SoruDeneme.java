package Ders49;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Ders49.Soru.Cevap;

public class SoruDeneme extends JPanel implements ActionListener{

	JLabel soruMetni;
	JRadioButton cevapRadioA,cevapRadioB,cevapRadioC,cevapRadioD;
	JButton onayButton;
	ButtonGroup cevaplarGrup;
	
	//Soru class'ýndan 5 tane objeyi tutan array oluþturduk.
	Soru[] sorular = new Soru[5];
	
	int gecerliSoru = 0;
	
	
	public SoruDeneme() {
		
		//Oluþturma
		soruMetni = new JLabel();
		cevapRadioA = new JRadioButton();
		cevapRadioB = new JRadioButton();
		cevapRadioC = new JRadioButton();
		cevapRadioD = new JRadioButton();
		onayButton = new JButton("Son Kararým!");
		cevaplarGrup = new ButtonGroup();
		
		//Gruplandýrma
		cevaplarGrup.add(cevapRadioA);
		cevaplarGrup.add(cevapRadioB);
		cevaplarGrup.add(cevapRadioC);
		cevaplarGrup.add(cevapRadioD);
		
		//Ekleme
		add(soruMetni);
		add(cevapRadioA);
		add(cevapRadioB);
		add(cevapRadioC);
		add(cevapRadioD);
		add(onayButton);
		
		onayButton.addActionListener(this);
	}
	
	public void sorularýOlustur()
	{
		//Constructor'ý kullanarak oluþturduðumuz bir objeyi obje dizimize ekledik.
		sorular[0] = new Soru("Türkiyenin baþkenti neresidir?","Ankara","Balýkesir","Ýstanbul","Ýzmir",Cevap.CEVAP_A);
		sorular[1] = new Soru("Hangisi programlama dili deðildir?","Java","C++","Oracle","C#",Cevap.CEVAP_C);
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
