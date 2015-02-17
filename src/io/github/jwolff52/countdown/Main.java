package io.github.jwolff52.countdown;

import io.github.jwolff52.countdown.util.Numbers;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		if(args.length==0) {
			System.out.println("Please provide a time!");
			System.exit(0);
		}
		int time = 0;
		switch(args[0].toLowerCase().charAt(args[0].length()-1)){
		case 's':
			try {
				time = Integer.valueOf(args[0].substring(0, args[0].length()-1));
			}catch(NumberFormatException e){
				System.out.println("Please provide a time!");
				System.exit(0);
			}
			break;
		case 'm':
			try {
				time = Integer.valueOf(args[0].substring(0, args[0].length()-1))*60;
			}catch(NumberFormatException e){
				System.out.println("Please provide a time!");
				System.exit(0);
			}
			break;
		default:
			try {
				time = Integer.valueOf(args[0])*60;
			}catch(NumberFormatException e){
				System.out.println("Please provide a time!");
				System.exit(0);
			}
		}
		while(time>=0) {
			displayTime(time);
			time--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
	private static void displayTime(int time) {
		String minutes=time/60+"";
		String seconds=time%60+"";
		ArrayList<String[]> output=new ArrayList<>();
		if(minutes.length()==2) {
			switch(minutes.charAt(0)) {
			case '0':
				output.add(Numbers.ZERO);
				break;
			case '1':
				output.add(Numbers.ONE);
				break;
			case '2':
				output.add(Numbers.TWO);
				break;
			case '3':
				output.add(Numbers.THREE);
				break;
			case '4':
				output.add(Numbers.FOUR);
				break;
			case '5':
				output.add(Numbers.FIVE);
				break;
			case '6':
				output.add(Numbers.SIX);
				break;
			case '7':
				output.add(Numbers.SEVEN);
				break;
			case '8':
				output.add(Numbers.EIGHT);
				break;
			case '9':
				output.add(Numbers.NINE);
				break;
			}
			switch(minutes.charAt(1)) {
			case '0':
				output.add(Numbers.ZERO);
				break;
			case '1':
				output.add(Numbers.ONE);
				break;
			case '2':
				output.add(Numbers.TWO);
				break;
			case '3':
				output.add(Numbers.THREE);
				break;
			case '4':
				output.add(Numbers.FOUR);
				break;
			case '5':
				output.add(Numbers.FIVE);
				break;
			case '6':
				output.add(Numbers.SIX);
				break;
			case '7':
				output.add(Numbers.SEVEN);
				break;
			case '8':
				output.add(Numbers.EIGHT);
				break;
			case '9':
				output.add(Numbers.NINE);
				break;
			}
		} else {
			output.add(Numbers.ZERO);
			switch(minutes.charAt(0)) {
			case '0':
				output.add(Numbers.ZERO);
				break;
			case '1':
				output.add(Numbers.ONE);
				break;
			case '2':
				output.add(Numbers.TWO);
				break;
			case '3':
				output.add(Numbers.THREE);
				break;
			case '4':
				output.add(Numbers.FOUR);
				break;
			case '5':
				output.add(Numbers.FIVE);
				break;
			case '6':
				output.add(Numbers.SIX);
				break;
			case '7':
				output.add(Numbers.SEVEN);
				break;
			case '8':
				output.add(Numbers.EIGHT);
				break;
			case '9':
				output.add(Numbers.NINE);
				break;
			}
		}
		output.add(Numbers.COLON);
		if(seconds.length()==2) {
			switch(seconds.charAt(0)) {
			case '0':
				output.add(Numbers.ZERO);
				break;
			case '1':
				output.add(Numbers.ONE);
				break;
			case '2':
				output.add(Numbers.TWO);
				break;
			case '3':
				output.add(Numbers.THREE);
				break;
			case '4':
				output.add(Numbers.FOUR);
				break;
			case '5':
				output.add(Numbers.FIVE);
				break;
			case '6':
				output.add(Numbers.SIX);
				break;
			case '7':
				output.add(Numbers.SEVEN);
				break;
			case '8':
				output.add(Numbers.EIGHT);
				break;
			case '9':
				output.add(Numbers.NINE);
				break;
			}
			switch(seconds.charAt(1)) {
			case '0':
				output.add(Numbers.ZERO);
				break;
			case '1':
				output.add(Numbers.ONE);
				break;
			case '2':
				output.add(Numbers.TWO);
				break;
			case '3':
				output.add(Numbers.THREE);
				break;
			case '4':
				output.add(Numbers.FOUR);
				break;
			case '5':
				output.add(Numbers.FIVE);
				break;
			case '6':
				output.add(Numbers.SIX);
				break;
			case '7':
				output.add(Numbers.SEVEN);
				break;
			case '8':
				output.add(Numbers.EIGHT);
				break;
			case '9':
				output.add(Numbers.NINE);
				break;
			}
		} else {
			output.add(Numbers.ZERO);
			switch(seconds.charAt(0)) {
			case '0':
				output.add(Numbers.ZERO);
				break;
			case '1':
				output.add(Numbers.ONE);
				break;
			case '2':
				output.add(Numbers.TWO);
				break;
			case '3':
				output.add(Numbers.THREE);
				break;
			case '4':
				output.add(Numbers.FOUR);
				break;
			case '5':
				output.add(Numbers.FIVE);
				break;
			case '6':
				output.add(Numbers.SIX);
				break;
			case '7':
				output.add(Numbers.SEVEN);
				break;
			case '8':
				output.add(Numbers.EIGHT);
				break;
			case '9':
				output.add(Numbers.NINE);
				break;
			}
		}
		StringBuilder out=new StringBuilder();
		for(int i=0;i<4;i++) {
			out.append(output.get(0)[i]+output.get(1)[i]+output.get(2)[i]+output.get(3)[i]+output.get(4)[i]+"\n");
		}
		out.append(output.get(0)[4]+output.get(1)[4]+output.get(2)[4]+output.get(3)[4]+output.get(4)[4]);
		System.out.println(out.toString());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
