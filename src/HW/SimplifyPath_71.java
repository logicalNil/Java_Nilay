package HW;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**public class SimplifyPath_71 {
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
**/

public class SimplifyPath_71 {
    public String simplifyPath(String path){
        Queue<String> q = new LinkedList<>();
        String[] p = path.split("/");
        for(int i=0;i<p.length;i++){
            if(!q.isEmpty() && p[i].equals("..")) q.poll();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                q.offer(p[i]);
        }
        if(q.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while(!q.isEmpty()){
            res.append("/").append(q.poll());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        SimplifyPath_71 sp = new SimplifyPath_71();
        String path = "/a/./b/../../c/";
        System.out.println(sp.simplifyPath(path));
    }
}

