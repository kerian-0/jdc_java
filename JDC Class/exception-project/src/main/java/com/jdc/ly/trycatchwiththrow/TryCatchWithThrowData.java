package com.jdc.ly.trycatchwiththrow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.io.IOException;

public class TryCatchWithThrowData {

	public void useMessage() {
		try {
			String message = getData();
			System.out.println(checkMessage(message));

		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (NoSuchElementException e) {
			System.err.println(e.getMessage());
		}
	}

	// when create check type ,must be throws that type
	// when create uncheck type ,it's all up to you
	// When you used throws ,it must be same type or super type of you create object exception

	private String checkMessage(String message) throws NullPointerException {
		if (message.length() == 0 || message.isBlank()) {
			throw new NullPointerException("There is no message");
		}
		return message;
	}

	private String getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your message!!!!!!!!!");
		return br.readLine();
	}
}
/*
 * unit test case
 * 
 * before all | afterall annotations သည် static methodတွေမာပဲ အလုပ်လုပ်ပါတယ်
 * 
 * @BeforeAll anno သည် method အားလုံးမစခင် အလုပ်လုပ်တယ်
 * 
 * @afterall anno သည် method အားလုံး ပြီးရင် အလုပ်လုပ်တယ်
 * 
 * @beforeEachသည် တစ်ခုမစခင်တတိုင်းလုပ်တယ်
 * 
 * @afterEachသည် တစ်ခုပြီးတိုင်း တစ်ခါလုပ်တယ်
 * 
 * 
 * @TestMethodOrder(OrderAnnotation.class) order asdc|dsc ထားချင်ရင်
 * ဒီannotation သုံး
 * 
 * check အမျိုးအစားဆို မဖြစ်မနေ throw ပစ်ပေးရမယ် unchecked ဆို throw မပစ်လည်းရ
 * handleလုပ်ချင်လည်း လုပ် မလုပ်ချင်လည်းနေ
 */
