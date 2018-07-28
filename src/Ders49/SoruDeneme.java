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
	
	//Soru class'�ndan 5 tane objeyi tutan array olu�turduk.
	Soru[] sorular = new Soru[5];
	
	int gecerliSoru = 0;
	
	
	public SoruDeneme() {
		
		//Olu�turma
		soruMetni = new JLabel();
		cevapRadioA = new JRadioButton();
		cevapRadioB = new JRadioButton();
		cevapRadioC = new JRadioButton();
		cevapRadioD = new JRadioButton();
		onayButton = new JButton("Son Karar�m!");
		cevaplarGrup = new ButtonGroup();
		
		//Grupland�rma
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
	
	public void sorular�Olustur()
	{
		//Constructor'� kullanarak olu�turdu�umuz bir objeyi obje dizimize ekledik.
		sorular[0] = new Soru("T�rkiyenin ba�kenti neresidir?","Ankara","Bal�kesir","�stanbul","�zmir",Cevap.CEVAP_A);
		sorular[1] = new Soru("Hangisi programlama dili de�ildir?","Java","C++","Oracle","C#",Cevap.CEVAP_C);
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
