package Music;

public class Melodia{
	public static void main(String[] args) throws InterruptedException {
				
		String cp =  "This is gonna hurt but I blame myself first\r\n"
				+ "Cause I ignored the truth\r\n"
				+ "Drunk off that love, fuck my head up\r\n"
				+ "There's no forgetting you\r\n"
				+ "You've awoken me, but you're choking me\r\n"
				+ "I was so obsessed\r\n"
				+ "Gave you all of me, and now honestly, I got nothing left\r\n"
				+ "I loved you dangerously\r\n"
				+ "More than the air that I breathe\r\n"
				+ "Knew we would crash at the speed that we were going\r\n"
				+ "Didn't care if the explosion ruined me\r\n"
				+ "Baby, I loved you dangerously\r\n"
				+ "Mm, mm\r\n"
				+ "I loved you dangerously\r\n"
				+ "Usually, I hold the power with both my hands\r\n"
				+ "Tied behind my back\r\n"
				+ "Look at how things change, 'cause now you're the train\r\n"
				+ "And I'm tied to the track\r\n"
				+ "You've awoken me, but you're choking me\r\n"
				+ "I was so obsessed\r\n"
				+ "Gave you all of me, and now honestly, I got nothing left\r\n"
				+ "'Cause I loved you dangerously\r\n"
				+ "More than the air that I breathe\r\n"
				+ "Knew we would crash at the speed that we were going\r\n"
				+ "Didn't care if the explosion ruined me\r\n"
				+ "Baby, I loved you dangerously\r\n"
				+ "You took me down, down, down, down\r\n"
				+ "And kissed my lips with goodbye\r\n"
				+ "I see it now, now, now, now\r\n"
				+ "It was a matter of time\r\n"
				+ "You know I know, there's only one place this could lead\r\n"
				+ "But you are the fire, I'm gasoline\r\n"
				+ "I love you, I love you, I love you\r\n"
				+ "I loved you dangerously\r\n"
				+ "Ooh, more than the air that I breathe\r\n"
				+ "Oh now, knew we would crash at the speed that we were going\r\n"
				+ "Didn't care if the explosion ruined me\r\n"
				+ "Oh, oh baby, I loved you dangerously\r\n"
				+ "Mm, mm\r\n"
				+ "Ooh, I loved you dangerously\r\n"
				+ "Ooh ooh, I loved you dangerously" ;
		
		String[] arr01 = cp.split("\r\n");  
		//System.out.println(Arrays.toString(arr01));
		
		//Melodia melodia = new Melodia();
		
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
			Thread.sleep(1000);
		}
		
	}
	
	

}
