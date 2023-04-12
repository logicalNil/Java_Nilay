package HW;

import java.util.Stack;

public class SimplifyPath_71 {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p =path.split("/");

        for(int i=0;i<p.length;i++){
            if(!s.isEmpty()  && p[i].equals("..")) s.pop();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s.push(p[i]);
        }


        if(s.isEmpty()) return "/";
        while(!s.isEmpty()){
            res.insert(0,s.pop()).insert(0,"/");
        }

        return res.toString();
    }

    public static void main(String[] args) {
        SimplifyPath_71 sp = new SimplifyPath_71();
        String path = "/a/./b/../../c/";
        System.out.println(sp.simplifyPath(path));
    }
}

