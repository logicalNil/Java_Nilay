package HW;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//Using Stack

public class SimplifyPath_71 {
    public String simplifyPath(String path) {
 /**       Stack<String> s = new Stack<>();
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

//Using Deque

 /**       Deque<String> q = new LinkedList<>();
        String[] p = path.split("/");
        for(int i=0;i<p.length;i++){
            if(!q.isEmpty() && p[i].equals("..")) q.pollLast();
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
  **/
 //Using StringBuilder
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");
        for(int i=0;i<p.length;i++){
            if(res.length()>0 && p[i].equals("..")) res.delete(res.lastIndexOf("/"),res.length());
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                res.append("/").append(p[i]);
        }
        if(res.length()==0) return "/";
        return res.toString();
    }
    public static void main(String[] args) {
        SimplifyPath_71 sp = new SimplifyPath_71();
        String path = "/a/./b/../../c/";
        System.out.println(sp.simplifyPath(path));
    }
}

