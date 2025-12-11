package com.example.runnershi.test


import java.io.*;
import java.util.*;

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder();


    while(true){
        val st = StringTokenizer(br.readLine());

        var M = Integer.parseInt(st.nextToken());
        var F = Integer.parseInt(st.nextToken());

        if(M==0 && F==0) break;
        sb.append(M+F).append('\n');
    }

    print(sb.toString());
}
