package com.ll.exam.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @RequestMapping("/sbb")
    @ResponseBody
    public String index(){
        System.out.println( "123456");
        return "죄나?";
    }
    @GetMapping("/page1")
    @ResponseBody
    public String showPage1() {
        return """
                <form method="POST" action="/page2">
                    <input type="number" name="a" placeholder="나이" />
                    <input type="number" name="b" placeholder="나이" />
                    <input type="submit" value="page2로 POST 방식으로 이동" />
                </form>
                """;
    }
    @PostMapping("/plus")
    @ResponseBody
    public String plus1(@RequestParam(defaultValue = "0") int a ,int b) {
        return """
                <h1>더한 값 : %d</h1>
            
                """.formatted(a + b);
    }

    @GetMapping("/plus")
    @ResponseBody
    public String plus(@RequestParam(defaultValue = "0") int a , int b) {
        return """
                <h1>더한 값 : %d</h1>
            
                """.formatted(a + b);
    }
    @PostMapping("/minus")
    @ResponseBody
    public String minusPoet(@RequestParam(defaultValue = "0") int a ,int b) {
        return """
                <h1>뺀 값 : %d</h1>
            
                """.formatted(a - b);
    }

    @GetMapping("/minus")
    @ResponseBody
    public String minusGet(@RequestParam(defaultValue = "0") int a , int b) {
        return """
                <h1>뺀 값 : %d</h1>
            
                """.formatted(a - b);
    }

    @GetMapping("/mbti")
    @ResponseBody
    public String showMbti(String name ) {
        String realname = name;
        switch (realname){
           case "홍길동":
               return "INFP";
            case "홍길순":
                return "ENFP";
            case "임꺽정":
                return "INFJ";
            case "이지현":
                return "ENFP";




        }



        return """
                <h1>뺀 값 : %d</h1>
            
                """.formatted();
    }

}
