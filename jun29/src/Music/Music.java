package Music;

import java.util.ArrayList;
import java.util.Arrays;

//배열에 가사넣기
//넣은 가사 thread.sleep 이용해서 1초마다 출력시키기 

public class Music {

		private String melodia;

		public String getMelodia() {
			return melodia;
		}

		public void setMelodia(String melodia) {
			this.melodia = melodia;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println();
		}
		
		
		
	}
