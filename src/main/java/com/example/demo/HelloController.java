package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// restControllerであることの宣言　ざっくり、「APIであること宣言する」ぐらいの解釈でいいと思う。
// RESTAPIという単語を知ってると理解が早いが、知らなければ、調べるより、手を動かしたほうがいい。
@RestController
// URLに/userと入力することで、このclass(ここでいうと、HelloControllerクラス)に結び付くよ、というおまじない
@RequestMapping("/user")
public class HelloController {

	// "Get"Mappingであることに注意。これは、「/getというパスに、GETリクエストが飛んでくると、この中身が動くよ」というおまじない。正確に言うと、上で指定したものを加味して「/user/get」である。
	@GetMapping("/get")
	// 返却する値をJSONで返せるようにいい感じにしてくれるおまじない。JSONというものは、形だけ知ってほしい。活用場所は、まだ知らなくていい。
	@ResponseBody
	public String getAllUser() {
		String result = "Stringを返します";
		return result;

	}

	// user/test というパスに、GETリクエストを送ると、実行される。ここは、返値が「void」であるため、返値無し。
	// さらに、メソッドにparamという変数名で、String型を渡すように言われている。たとえのリクエストを張っておくので、これをブラウザに突っ込んでほしい。
	// http://localhost:8080/user/test?param=くええええええええ
	@GetMapping("/test")
	public void testMethod(@RequestParam String param) {
		System.out.println("----------次の行で、引数を出力します。");
		System.out.println(param);
	}

}