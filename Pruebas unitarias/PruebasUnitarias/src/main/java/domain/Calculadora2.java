/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Calculadora2 {

    private int ans;

    public Calculadora2() {
        ans = 0;
    }

    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }
    
    public int div(int a,int b){
        ans=a/b;
        return ans;
    }
    public int add(int v) {
        ans += v;
        return ans;
    }

    public int sub(int v) {
        ans -= v;
        return ans;
    }

    public int ans() {
        return ans;
    }
    
    public void clear(){
        ans=0;
    }
}
