package Alphabet_Apps;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.JavaClipAudioPlayer;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Alphabet_App extends JFrame {

	private static final String TalkTalk = "kevin16";
    private JPanel contentPane;
    private	JButton jbtnTextSpeech;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alphabet_App frame = new Alphabet_App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the frame.
	 */
	public Alphabet_App() {
		setTitle("Alphabet Street");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//jbtnTextSpeech.setText("A is for Apple");
				
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("A is for Apple");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
				jbtnTextSpeech.setText("A is for Apple");
			}
		});
		btnA.setIcon(new ImageIcon("D:\\Alphabet name\\Apple.jpg"));
		btnA.setBounds(10, 11, 151, 162);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("B is for Banana");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnB.setIcon(new ImageIcon("D:\\Alphabet name\\Banana.jpg"));
		btnB.setBounds(171, 11, 151, 162);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("C is for Cheerry");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnC.setIcon(new ImageIcon("D:\\Alphabet name\\Cheerry.jpg"));
		btnC.setBounds(332, 11, 151, 162);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("D is for Durian");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnD.setIcon(new ImageIcon("D:\\Alphabet name\\Durian.jpg"));
		btnD.setBounds(493, 11, 151, 162);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("E is for Egg Fruit");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnE.setIcon(new ImageIcon("D:\\Alphabet name\\Egg Fruit.jpg"));
		btnE.setBounds(654, 11, 151, 162);
		contentPane.add(btnE);
		
		JButton btnF = new JButton("");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("F is for Feijoas");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnF.setIcon(new ImageIcon("D:\\Alphabet name\\Feijoas.jpg"));
		btnF.setBounds(815, 11, 151, 162);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("G is for Grapes");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnG.setIcon(new ImageIcon("D:\\Alphabet name\\Grapes.jpg"));
		btnG.setBounds(976, 11, 151, 162);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("H is for HoneydewMelon");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
				
			}
		});
		btnH.setIcon(new ImageIcon("D:\\Alphabet name\\Honeydew_Melon.jpg"));
		btnH.setBounds(1147, 11, 151, 162);
		contentPane.add(btnH);
		
		JButton btnP = new JButton("");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("P is for Pineapple");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnP.setIcon(new ImageIcon("D:\\Alphabet name\\Pineapple.jpg"));
		btnP.setBounds(1147, 183, 151, 162);
		contentPane.add(btnP);
		
		JButton btnO = new JButton("");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("O is for Orange");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnO.setIcon(new ImageIcon("D:\\Alphabet name\\Orange.jpg"));
		btnO.setBounds(976, 183, 151, 162);
		contentPane.add(btnO);
		
		JButton btnN = new JButton("");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("N is for Nutmeg");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnN.setIcon(new ImageIcon("D:\\Alphabet name\\Nutmeg.jpg"));
		btnN.setBounds(815, 183, 151, 162);
		contentPane.add(btnN);
		
		JButton btnM = new JButton("");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("M is for Mango");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnM.setIcon(new ImageIcon("D:\\Alphabet name\\Mango.jpg"));
		btnM.setBounds(654, 183, 151, 162);
		contentPane.add(btnM);
		
		JButton btnL = new JButton("");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("L is for Litchi");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnL.setIcon(new ImageIcon("D:\\Alphabet name\\Litchi.jpg"));
		btnL.setBounds(493, 183, 151, 162);
		contentPane.add(btnL);
		
		JButton btnK = new JButton("");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("K is for Kiwi");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnK.setIcon(new ImageIcon("D:\\Alphabet name\\Kiwi.jpg"));
		btnK.setBounds(332, 183, 151, 162);
		contentPane.add(btnK);
		
		JButton btnJ = new JButton("");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("J is for jenipapa");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnJ.setIcon(new ImageIcon("D:\\Alphabet name\\jenipapa.jpg"));
		btnJ.setBounds(171, 183, 151, 162);
		contentPane.add(btnJ);
		
		JButton btnI = new JButton("");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("I is for Itapalm");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
				
			}
		});
		btnI.setIcon(new ImageIcon("D:\\Alphabet name\\Ita_palm.jpg"));
		btnI.setBounds(10, 183, 151, 162);
		contentPane.add(btnI);
		
		JButton btnX = new JButton("");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("X is for Xylophone");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
			}
			}
		});
		btnX.setIcon(new ImageIcon("D:\\Alphabet name\\Xylophone.jpg"));
		btnX.setBounds(1147, 355, 151, 162);
		contentPane.add(btnX);
		
		JButton btnW = new JButton("");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("W is for Watermelon");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
			}
			}
		});
		btnW.setIcon(new ImageIcon("D:\\Alphabet name\\Watermelon.jpg"));
		btnW.setBounds(815, 355, 151, 162);
		contentPane.add(btnW);
		
		JButton btnV = new JButton("");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("V is for Vanilla");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
			}
			}
		});
		btnV.setIcon(new ImageIcon("D:\\Alphabet name\\Vanilla.jpg"));
		btnV.setBounds(976, 355, 151, 162);
		contentPane.add(btnV);
		
		JButton btnU = new JButton("");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("U is for Uchuva");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
			}
			}
		});
		btnU.setIcon(new ImageIcon("D:\\Alphabet name\\Uchuva.jpg"));
		btnU.setBounds(654, 355, 151, 162);
		contentPane.add(btnU);
		
		JButton btnT = new JButton("");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("T is for Thimblebeery");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnT.setIcon(new ImageIcon("D:\\Alphabet name\\Thimblebeery.jpg"));
		btnT.setBounds(493, 355, 151, 162);
		contentPane.add(btnT);
		
		JButton btnS = new JButton("");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("S is for Strawberry");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnS.setIcon(new ImageIcon("D:\\Alphabet name\\Strawberry.jpg"));
		btnS.setBounds(332, 355, 151, 162);
		contentPane.add(btnS);
		
		JButton btnR = new JButton("");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("R is for Raspberry");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnR.setIcon(new ImageIcon("D:\\Alphabet name\\Raspberry.jpg"));
		btnR.setBounds(171, 355, 151, 162);
		contentPane.add(btnR);
		
		JButton btnQ = new JButton("");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("Q is for Quince");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
				}
			}
		});
		btnQ.setIcon(new ImageIcon("D:\\Alphabet name\\Quince.jpg"));
		btnQ.setBounds(10, 355, 151, 162);
		contentPane.add(btnQ);
		
		JButton btnY = new JButton("");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("Y is for YellowSquash");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
			}
			}
		});
		btnY.setIcon(new ImageIcon("D:\\Alphabet name\\Yellow_Squash.jpg"));
		btnY.setBounds(10, 527, 151, 162);
		contentPane.add(btnY);
		
		JButton jbtnTextSpeech = new JButton("Alphabet Street App");
		jbtnTextSpeech.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnTextSpeech.setBounds(171, 527, 634, 162);
		contentPane.add(jbtnTextSpeech);
		
		JButton btnZ = new JButton("");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voice iTalk;
				VoiceManager iSpeak = VoiceManager.getInstance();
				iTalk = iSpeak.getVoice(TalkTalk);
				iTalk.allocate();
				try
				{
					iTalk.speak("Z is for Zapote");
					}catch(Exception ex)
				{
						JOptionPane.showConfirmDialog(null, "Can't Talk, have Error");
			}
			}
		});
		btnZ.setIcon(new ImageIcon("D:\\Alphabet name\\Zapote.jpg"));
		btnZ.setBounds(815, 527, 151, 162);
		contentPane.add(btnZ);
	}
}
