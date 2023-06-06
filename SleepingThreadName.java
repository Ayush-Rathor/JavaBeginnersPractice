class SleepingThread extends Thread{
	public void run(){
		int a=20;
		for (int i=0;i<9;i++){
			for(int j=0;j<59;j++){
				if((i==0 && (j==10||j==20||j==28||j==30||j==38||(j>=40&&j<=48)||j==50||j==58))||(i==1 &&(j==9||j==11||j==21||j==27||j==30||j==38||j==40||
				    j==50||j==58))||(i==2 && (j==8||j==12||j==22||j==26||j==30||j==38||j==40||j==50||j==58))||(i==3 && (j==7||j==13||j==23||j==25||j==30
				    ||j==38||j==40||j==50||j==58))||(i==4 && ((j>=6&&j<=14)||j==24||j==30||j==38||(j>=40&&j<=48)||(j>=50&&j<=58)))||(i==5 &&
				    (j==5||j==15||j==24||j==30||j==38||j==48||j==50||j==58))||(i==6 && (j==4||j==16||j==24||j==30||j==38||j==48||j==50||j==58))||(i==7 &&
				    (j==3||j==17||j==24||j==30||j==38||j==48||j==50||j==58))||(i==8 && (j==2||j==18||j==24||(j>=30&&j<=38)||(j>=40&&j<=48)||j==50||j==58))){
					System.out.print(" *");
					try{
						Thread.sleep(a+10);
					}
					catch(Exception e){
						System.out.println(e);
						}
					}
					else{
						System.out.print("  ");
						}
				}
				System.out.println();
			}
		}
}

class SleepingThreadName{
	public static void main(String args[]){
		SleepingThread t=new SleepingThread();
		t.start();
		}
	}