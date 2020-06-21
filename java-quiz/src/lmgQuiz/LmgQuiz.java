package lmgQuiz;

import java.util.HashMap;
import java.util.Map.Entry;

public class LmgQuiz {
	public static void main(String[] args) {
		System.out.println("1. หาผลบวกของตัวเลขทั้งหมดใน string ต่อไปนี้");
		String q1 = "1234";
		String q2 = "42281";
		String q3 = "42";

		System.out.println("\""+q1+"\""+" = "+findSumOfString(q1));
		System.out.println("\""+q2+"\""+" = "+findSumOfString(q2));
		System.out.println("\""+q3+"\""+" = "+findSumOfString(q3));
		System.out.println();
		
		System.out.println("2. หาตัวเลขที่ไม่ซ้ำกันใน array ต่อไปนี้");
		int a1[] = {1,2,1,2,3,4};
		int a2[] = {1,2};
		int a3[] = {1,3,4,1};
		System.out.println("[1,2,1,2,3,4] = " +removeDuplicatetValue(a1));
		System.out.println("[1,2] = " +removeDuplicatetValue(a2));
		System.out.println("[1,3,4,1] = " +removeDuplicatetValue(a3));
		System.out.println();
		
		System.out.println("3. เช็คว่า string เมื่อย้อนอ่านแล้วได้ string ตัวเดิมไหม");
		String str1 = "dad";
		String str2 = "hello";
		String str3 = "level";
		String str4 = "thai";
		System.out.println("\""+str1+"\""+" = "+isPalindrome(str1));
		System.out.println("\""+str2+"\""+" = "+isPalindrome(str2));
		System.out.println("\""+str3+"\""+" = "+isPalindrome(str3));
		System.out.println("\""+str4+"\""+" = "+isPalindrome(str4));
		System.out.println();
		
		/*
		 * - เขียน SQL ให้แสดงผล first_name, last_name และ department_name
		 * select e.first_name, e.last_name, d.department_id from employee e 
		 * left join department d on e.department_id = d.id
		 * - เขียน SQL ให้แสดงผล phone_number ของ employee ที่ชื่อ john
		 * select p.phone_number from employee e right join phone p on e.id = p.id 
		 * where e.first_name = 'John'
		 */
	}
	
	public static int findSumOfString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		
		return sum;
	}
	
	public static String removeDuplicatetValue(int values[]) {

		HashMap<Integer, Integer> filloutDups = new HashMap<Integer, Integer>();
		
		String result = "";
		int tmp = values[0];
		filloutDups.put(values[0], 1);
		
		for (int i = 1; i < values.length; i++) {
			if (values[i] == tmp) {
				filloutDups.put(values[i], filloutDups.get(values[i]+1));;
			} else {
				filloutDups.put(values[i], 1);
			}
			tmp = values[i];
		}

		for (Entry<Integer, Integer> filloutDup : filloutDups.entrySet()) {
			result += filloutDup.getKey()+"," ;
		}
		return result;
	}
	
	public static String isPalindrome(String str) {
		String normalStr = str;
		String reverseStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			reverseStr += c;
		}
		
		return normalStr.equalsIgnoreCase(reverseStr)? "Yes" : "No";
	}
}

