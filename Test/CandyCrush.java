
package cc;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Random;

public class CandyCrush extends javax.swing.JFrame {
    
    int MainArray[][] = new int [10][10];
    ArrayHelp A = new ArrayHelp();
    ArrayHelp B = new ArrayHelp();
    boolean First = false;
    boolean Second = false;
    boolean check[][] = new boolean[10][10];
    boolean ch = false;
    int Count=0;
    int MoveCount=0;
    public int finalScore;
    public int finalMove;
    
    public CandyCrush() throws FileNotFoundException {
        initComponents();
        String s =  JOptionPane.showInputDialog(null,"Write your Username ","Sing UP",JOptionPane.INFORMATION_MESSAGE);
        File file = new File("src\\cc\\Input.txt");
        PrintWriter output = new PrintWriter(file);
        output.print(""+s);
        output.close();
        PName.setText(""+s);
            for (int i=0 ; i<10 ; i++){
            for (int j=0 ; j<10 ; j++){
                MainArray[i][j] = 0;
                getButton(i, j).setBackground(null);
        }
    }
    for (int i=0 ; i<10 ; i++){
    for (int j=0 ; j<10 ; j++){
        check[i][j] = false;
    }
}
    }
    public void Win(){
        if ((finalMove!=0)&&(Integer.parseInt(Move.getText())>=finalMove)){
             JOptionPane.showMessageDialog(null, "Game Over!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else if (Integer.parseInt(Score.getText())>finalScore){
            if(finalMove==0){
            JOptionPane.showMessageDialog(null, "You won!", "Well Done", JOptionPane.INFORMATION_MESSAGE);
                }else if ((finalMove!=0)&&(Integer.parseInt(Score.getText())>=finalMove)){
            JOptionPane.showMessageDialog(null, "You won!", "Well Done", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }
    
    public void Random(){
        Random r = new Random();
        for (int i=0 ; i<10 ; i++){
            for (int j=0; j<10 ; j++){
                if (MainArray[i][j] == 0){
                MainArray[i][j] = r.nextInt(6) + 1;
                if (MainArray[i][j] == 1){
                    getButton(i , j).setBackground(Color.red);
                }else if(MainArray[i][j] == 2){
                    getButton(i, j).setBackground(Color.BLUE);
                }else if (MainArray[i][j] == 3){
                    getButton(i, j).setBackground(Color.GREEN);
                }else if (MainArray[i][j] == 4){
                    getButton(i, j).setBackground(Color.yellow);
                }else if (MainArray[i][j] == 5){
                    getButton(i, j).setBackground(Color.PINK);
                }else if (MainArray[i][j] == 6){
                    getButton(i, j).setBackground(Color.MAGENTA);
                }
            }
            }
        }
    }
    public JButton getButton(int x , int y){
        JButton Button[][] = {{_0_0,_0_1,_0_2,_0_3,_0_4,_0_5,_0_6,_0_7,_0_8,_0_9},{_1_0,_1_1,_1_2,_1_3,_1_4,_1_5,_1_6,_1_7,_1_8,_1_9},{_2_0,_2_1,_2_2,_2_3,_2_4,_2_5,_2_6,_2_7,_2_8,_2_9},{_3_0,_3_1,_3_2,_3_3,_3_4,_3_5,_3_6,_3_7,_3_8,_3_9},{_4_0,_4_1,_4_2,_4_3,_4_4,_4_5,_4_6,_4_7,_4_8,_4_9},{_5_0,_5_1,_5_2,_5_3,_5_4,_5_5,_5_6,_5_7,_5_8,_5_9},{_6_0,_6_1,_6_2,_6_3,_6_4,_6_5,_6_6,_6_7,_6_8,_6_9},{_7_0,_7_1,_7_2,_7_3,_7_4,_7_5,_7_6,_7_7,_7_8,_7_9},{_8_0,_8_1,_8_2,_8_3,_8_4,_8_5,_8_6,_8_7,_8_8,_8_9},{_9_0,_9_1,_9_2,_9_3,_9_4,_9_5,_9_6,_9_7,_9_8,_9_9}};
        return Button[x][y];
    }
    public void CheckFirst(){
        
   for(int i=0 ;i<=9 ; i++){
   for(int j=0 ;j<=7 ; j++){
   int c=0;
      if(getButton(i, j).getBackground()==Color.GREEN)
      for(int u=j; u<=j+2 ; u++){
         if(getButton(i, u).getBackground()==Color.GREEN)
              c++;
      }
      else if(getButton(i, j).getBackground()==Color.red)
      for(int u=j; u<=j+2 ; u++){
         if(getButton(i, u).getBackground()==Color.red)
              c++;
      }
      else if(getButton(i, j).getBackground()==Color.BLUE)
      for(int u=j; u<=j+2 ; u++){
         if(getButton(i, u).getBackground()==Color.BLUE)
              c++;
      }
      else if(getButton(i, j).getBackground()==Color.yellow)
      for(int u=j; u<=j+2 ; u++){
         if(getButton(i, u).getBackground()==Color.yellow)
              c++;
      }
      else if(getButton(i, j).getBackground()==Color.PINK)
      for(int u=j; u<=j+2 ; u++){
         if(getButton(i, u).getBackground()==Color.PINK)
              c++;
      }
      else if(getButton(i, j).getBackground()==Color.MAGENTA)
      for(int u=j; u<=j+2 ; u++){
         if(getButton(i, u).getBackground()==Color.MAGENTA)
              c++;
      }
     if(c==3){
               if (MainArray[i][j] == 6){
                   MainArray[i][j] = 1;
               }else if(MainArray[i][j] < 6)
               MainArray[i][j+1] = MainArray[i][j]++;
               if (MainArray[i][j] == 1){
                    getButton(i , j).setBackground(Color.red);
                }else if(MainArray[i][j] == 2){
                    getButton(i, j).setBackground(Color.BLUE);
                }else if (MainArray[i][j] == 3){
                    getButton(i, j).setBackground(Color.GREEN);
                }else if (MainArray[i][j] == 4){
                    getButton(i, j).setBackground(Color.yellow);
                }else if (MainArray[i][j] == 5){
                    getButton(i, j).setBackground(Color.PINK);
                }else if (MainArray[i][j] == 6){
                    getButton(i, j).setBackground(Color.MAGENTA);
                }
               CheckFirst();
             }
   }
}
   
   for(int j=0 ; j<=9 ; j++){
   for(int i=0 ; i<=7 ; i++){
     int c = 0 ;
     if(getButton(i, j).getBackground()==Color.GREEN)
       for(int p=i ; p<=i+2 ; p++){
           if(getButton(p, j).getBackground()==Color.GREEN)
                c++;
      }
     else if(getButton(i, j).getBackground()==Color.red)
       for(int p=i ; p<=i+2 ; p++){
           if(getButton(p, j).getBackground()==Color.red)
                c++;
      }
     else if(getButton(i, j).getBackground()==Color.BLUE)
       for(int p=i ; p<=i+2 ; p++){
           if(getButton(p, j).getBackground()==Color.BLUE)
                c++;
      }
     else if(getButton(i, j).getBackground()==Color.yellow)
       for(int p=i ; p<=i+2 ; p++){
           if(getButton(p, j).getBackground()==Color.yellow)
                c++;
      }
     else if(getButton(i, j).getBackground()==Color.PINK)
       for(int p=i ; p<=i+2 ; p++){
           if(getButton(p, j).getBackground()==Color.PINK)
                c++;
      }
     else if(getButton(i, j).getBackground()==Color.MAGENTA)
       for(int p=i ; p<=i+2 ; p++){
           if(getButton(p, j).getBackground()==Color.MAGENTA)
                c++;
      }
       if(c==3){
                          if (MainArray[i][j] == 6){
                   MainArray[i][j] = 1;
               }else if(MainArray[i][j] < 6)
              MainArray[i+1][j] = MainArray[i][j]++;
              if (MainArray[i][j] == 1){
                    getButton(i , j).setBackground(Color.red);
                }else if(MainArray[i][j] == 2){
                    getButton(i, j).setBackground(Color.BLUE);
                }else if (MainArray[i][j] == 3){
                    getButton(i, j).setBackground(Color.GREEN);
                }else if (MainArray[i][j] == 4){
                    getButton(i, j).setBackground(Color.yellow);
                }else if (MainArray[i][j] == 5){
                    getButton(i, j).setBackground(Color.PINK);
                }else if (MainArray[i][j] == 6){
                    getButton(i, j).setBackground(Color.MAGENTA);
                }
              CheckFirst();
               }
   }
}
        }
    boolean exsist1 = false;
    public void Switch(){
        int temp = MainArray[A.Sa][A.So];
        MainArray[A.Sa][A.So]=MainArray[B.Sa][B.So];
        MainArray[B.Sa][B.So]=temp;
        Color Ct = getButton(A.Sa,A.So).getBackground();
        getButton(A.Sa,A.So).setBackground(getButton(B.Sa,B.So).getBackground());
        getButton(B.Sa,B.So).setBackground(Ct);
        int cr =0;
        int cg =0;
        int cb =0;
        int cy =0;
        int cp =0;
        int cm=0;
        boolean exsist = false;
        for(int i = 0 ;i <8 ;i++){
                 cr=0;
                 cg=0;
                 cb=0;
                 cy=0;
                 cp=0;
                 cm=0;
                 if(getButton(i, A.So).getBackground()==Color.red){
                for(int u=i;u<=i+2;u++){
                    if(getButton(u, A.So).getBackground()==Color.red)
                        cr++;
                }if(cr==3){
                    exsist =true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u, A.So).setBackground(null);
                        //MainArray[u][A.So]=0;
                    }
                }
        }
                 if(getButton(i, A.So).getBackground()==Color.GREEN){
                     for(int u=i;u<=i+2;u++){
                    if(getButton(u, A.So).getBackground()==Color.GREEN)
                        cg++;
                }if(cg==3){
                    exsist =true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u, A.So).setBackground(null);
                        //MainArray[u][A.So]=0;
                    }
                }
                 }
                 if(getButton(i, A.So).getBackground()==Color.BLUE){
                     for(int u=i;u<=i+2;u++){
                    if(getButton(u, A.So).getBackground()==Color.BLUE)
                        cb++;
                }if(cb==3){
                    exsist =true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u, A.So).setBackground(null);
                        //MainArray[u][A.So]=0;
                    }
                }
                 }
                 if(getButton(i, A.So).getBackground()==Color.yellow){
                     for(int u=i;u<=i+2;u++){
                    if(getButton(u, A.So).getBackground()==Color.yellow)
                        cy++;
                }if(cy==3){
                    exsist =true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u, A.So).setBackground(null);
                        //MainArray[u][A.So]=0;
                    }
                }
                 }
                 if(getButton(i, A.So).getBackground()==Color.PINK){
                     for(int u=i;u<=i+2;u++){
                    if(getButton(u, A.So).getBackground()==Color.PINK)
                        cp++;
                }if(cp==3){
                    exsist =true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u, A.So).setBackground(null);
                        //MainArray[u][A.So]=0;
                    }
                }
                 }
                 if(getButton(i, A.So).getBackground()==Color.MAGENTA){
                     for(int u=i;u<=i+2;u++){
                    if(getButton(u, A.So).getBackground()==Color.MAGENTA)
                        cm++;
                }if(cm==3){
                    exsist =true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u, A.So).setBackground(null);
                        //MainArray[u][A.So]=0;
                    }
                }
                 }
            }if(exsist==false){
            for(int i=0;i<8;i++){
                cr=0;
                cg=0;
                cb=0;
                cy=0;
                cp=0;
                cm=0;
                if(getButton(i,B.So).getBackground()==Color.red){  
                for(int u=i;u<=i+2;u++){
                    if(getButton(u,B.So).getBackground()==Color.red)
                        cr++;
                }if(cr==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u,B.So).setBackground(null);
                        //MainArray[u][B.So]=0;
                    }
                }
              }
                if(getButton(i,B.So).getBackground()==Color.GREEN){  
                for(int u=i;u<=i+2;u++){
                    if(getButton(u,B.So).getBackground()==Color.GREEN)
                        cg++;
                }if(cg==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u,B.So).setBackground(null);
                        //MainArray[u][B.So]=0;
                    }
                }
              }
                if(getButton(i,B.So).getBackground()==Color.BLUE){  
                for(int u=i;u<=i+2;u++){
                    if(getButton(u,B.So).getBackground()==Color.BLUE)
                        cb++;
                }if(cb==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u,B.So).setBackground(null);
                        //MainArray[u][B.So]=0;
                    }
                }
              }
                if(getButton(i,B.So).getBackground()==Color.yellow){  
                for(int u=i;u<=i+2;u++){
                    if(getButton(u,B.So).getBackground()==Color.yellow)
                        cy++;
                }if(cy==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u,B.So).setBackground(null);
                        //MainArray[u][B.So]=0;
                    }
                }
              }
                if(getButton(i,B.So).getBackground()==Color.PINK){  
                for(int u=i;u<=i+2;u++){
                    if(getButton(u,B.So).getBackground()==Color.PINK)
                        cp++;
                }if(cp==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u,B.So).setBackground(null);
                        //MainArray[u][B.So]=0;
                    }
                }
              }
                if(getButton(i,B.So).getBackground()==Color.MAGENTA){  
                for(int u=i;u<=i+2;u++){
                    if(getButton(u,B.So).getBackground()==Color.MAGENTA)
                        cm++;
                }if(cm==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=i;u<=i+2;u++){
                        //getButton(u,B.So).setBackground(null);
                        //MainArray[u][B.So]=0;
                    }
                }
              }
            }
            }if(exsist==false){
            for(int j=0;j<=7;j++){
                cr=0;
                cg=0;
                cb=0;
                cy=0;
                cp=0;
                cm=0;
              if(getButton(A.Sa , j).getBackground()==Color.red){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(A.Sa, u).getBackground()==Color.red)
                        cr++;
                }if(cr==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(A.Sa, u).setBackground(null);
                        //MainArray[A.Sa][u]=0;
                    }
                }
              }
              if(getButton(A.Sa , j).getBackground()==Color.GREEN){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(A.Sa, u).getBackground()==Color.GREEN)
                        cg++;
                }if(cg==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(A.Sa, u).setBackground(null);
                        //MainArray[A.Sa][u]=0;
                    }
                }
              }
              if(getButton(A.Sa , j).getBackground()==Color.BLUE){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(A.Sa, u).getBackground()==Color.BLUE)
                        cb++;
                }if(cb==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(A.Sa, u).setBackground(null);
                        //MainArray[A.Sa][u]=0;
                    }
                }
              }
              if(getButton(A.Sa , j).getBackground()==Color.yellow){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(A.Sa, u).getBackground()==Color.yellow)
                        cy++;
                }if(cy==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(A.Sa, u).setBackground(null);
                        //MainArray[A.Sa][u]=0;
                    }
                }
              }
              if(getButton(A.Sa , j).getBackground()==Color.PINK){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(A.Sa, u).getBackground()==Color.PINK)
                        cp++;
                }if(cp==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(A.Sa, u).setBackground(null);
                        //MainArray[A.Sa][u]=0;
                    }
                }
              }
              if(getButton(A.Sa , j).getBackground()==Color.MAGENTA){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(A.Sa, u).getBackground()==Color.MAGENTA)
                        cm++;
                }if(cm==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(A.Sa, u).setBackground(null);
                        //MainArray[A.Sa][u]=0;
                    }
                }
              }
            }
            }if(exsist==false){
                for(int j=0;j<=7;j++){
                cr=0;
                cg=0;
                cb=0;
                cy=0;
                cp=0;
                cm=0;
              if(getButton(B.Sa , j).getBackground()==Color.red){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(B.Sa, u).getBackground()==Color.red)
                        cr++;
                }if(cr==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(B.Sa, u).setBackground(null);
                        //MainArray[B.Sa][u]=0;
                    }
                }
              }
              if(getButton(B.Sa , j).getBackground()==Color.GREEN){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(B.Sa, u).getBackground()==Color.GREEN)
                        cg++;
                }if(cg==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(B.Sa, u).setBackground(null);
                        //MainArray[B.Sa][u]=0;
                    }
                }
              }
              if(getButton(B.Sa , j).getBackground()==Color.BLUE){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(B.Sa, u).getBackground()==Color.BLUE)
                        cb++;
                }if(cb==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(B.Sa, u).setBackground(null);
                        //MainArray[B.Sa][u]=0;
                    }
                }
              }
              if(getButton(B.Sa , j).getBackground()==Color.yellow){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(B.Sa, u).getBackground()==Color.yellow)
                        cy++;
                }if(cy==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(B.Sa, u).setBackground(null);
                        //MainArray[B.Sa][u]=0;
                    }
                }
              }
              if(getButton(B.Sa , j).getBackground()==Color.PINK){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(B.Sa, u).getBackground()==Color.PINK)
                        cp++;
                }if(cp==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(B.Sa, u).setBackground(null);
                        //MainArray[B.Sa][u]=0;
                    }
                }
              }
              if(getButton(B.Sa , j).getBackground()==Color.MAGENTA){  
                for(int u=j;u<=j+2;u++){
                    if(getButton(B.Sa, u).getBackground()==Color.MAGENTA)
                        cm++;
                }if(cm==3){
                    exsist=true;
                    exsist1 = true;
                    //Move.setText(String.valueOf(++MoveCount));
                    for(int u=j;u<=j+2;u++){
                        //getButton(B.Sa, u).setBackground(null);
                        //MainArray[B.Sa][u]=0;
                    }
                }
              }
            }
            }if(exsist==false){
                int temp1 = MainArray[B.Sa][B.So];
                MainArray[B.Sa][B.So]=MainArray[A.Sa][A.So];
                MainArray[A.Sa][A.So]=temp1;
                Color Ct1 = getButton(B.Sa,B.So).getBackground();
                getButton(B.Sa,B.So).setBackground(getButton(A.Sa,A.So).getBackground());
                getButton(A.Sa,A.So).setBackground(Ct1);
                }
    }
    public void Three(){
        Count=Count+60;
        Score.setText(""+Count);
    }
    public void Four(){
        Count=Count+200;
        Score.setText(""+Count);
                }
        public void Five(){
        Count=Count+300;
        Score.setText(""+Count);
                }
   public void delete(){
   for(int i=0 ;i<=9 ; i++){
   for(int j=0 ;j<=9 ; j++){
   int c=0;
      if(MainArray[i][j]==1){
          int count=1;
      while ((count+j<=9)&&(MainArray[i][j+count]==1)){
              count++;
      }
      if (count == 3){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
                  Three();
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Four();
      }
          else if (count == 5){
              for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
              Five();
          }
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==2){
          int count=1;
      while ((count+j<=9)&&(MainArray[i][j+count]==2)){
              count++;
      }
      if (count == 3){   
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Three();
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
                    if (count == 4){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Four();
      }
          else if (count == 5){
              for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
              Five();
          }
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==3){
          int count=1;
      while ((count+j<=9)&&(MainArray[i][j+count]==3)){
              count++;
      }
      if (count == 3){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Three();
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Four();
      }
          else if (count == 5){
              for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
              Five();
          }
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
       if(MainArray[i][j]==4){
          int count=1;
      while ((count+j<=9)&&(MainArray[i][j+count]==4)){
              count++;
      }
      if (count == 3){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Three();
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Four();
      }
          else if (count == 5){
              for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
              Five();
          }
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==5){
          int count=1;
      while ((count+j<=9)&&(MainArray[i][j+count]==5)){
              count++;
      }
      if (count == 3){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Three();
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Four();
      }
          else if (count == 5){
              for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
              Five();
          }
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==6){
          int count=1;
      while ((count+j<=9)&&(MainArray[i][j+count]==6)){
              count++;
      }
      if (count == 3){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Three();
        j=j+count-1;
        //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
          Four();
      }
          else if (count == 5){
              for (int s=j ; s<j+count ;s++){
              MainArray[i][s]=0;
              getButton(i , s).setBackground(null);
          }
              Five();
          }
                  j=j+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
   }
}
   
//------------------------------------------------------------------------------
   
   for(int i=0 ;i<=9 ; i++){
   for(int j=0 ;j<=9 ; j++){
   int c=0;
      if(MainArray[i][j]==1){
          int count=1;
      while ((count+i<=9)&&(MainArray[i+count][j]==1)){
              count++;
      }
      if (count == 3){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Three();
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Four();
          }
          if (count == 5){
            for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
              Five();
          }
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==2){
          int count=1;
      while ((count+i<=9)&&(MainArray[i+count][j]==2)){
              count++;
      }
      if (count == 3){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Three();
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Four();
          }
          if (count == 5){
            for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
              Five();
          }
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==3){
          int count=1;
      while ((count+i<=9)&&(MainArray[i+count][j]==3)){
              count++;
      }
      if (count == 3){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Three();
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Four();
          }
          if (count == 5){
            for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
              Five();
          }
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
       if(MainArray[i][j]==4){
          int count=1;
      while ((count+i<=9)&&(MainArray[i+count][j]==4)){
              count++;
      }
      if (count == 3){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Three();
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Four();
          }
          if (count == 5){
            for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
              Five();
          }
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==5){
          int count=1;
      while ((count+i<=9)&&(MainArray[i+count][j]==5)){
              count++;
      }
      if (count == 3){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Three();
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Four();
          }
          if (count == 5){
            for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
              Five();
          }
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
      if(MainArray[i][j]==6){
          int count=1;
      while ((count+i<=9)&&(MainArray[i+count][j]==6)){
              count++;
      }
      if (count == 3){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Three();
       i=i+count-1;
       //Move.setText(String.valueOf(++MoveCount));
      }else if (count > 3){
          if (count == 4){
          for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
          Four();
          }
          if (count == 5){
            for (int s=i ; s<i+count ;s++){
              MainArray[s][j]=0;
              getButton(s , j).setBackground(null);
          }
              Five();
          }
                  i=i+count-1;
                  //Move.setText(String.valueOf(++MoveCount));
      }
      }
   }
} 
    }
    public void Down(){
        for (int j=9 ; j>=0 ;j--){
            for(int i=9 ;i>=0 ;i--){
                if (i<=8){
                    if ((MainArray[i+1][j]==0)&&(MainArray[i][j]!=0)){
                        Color ct = getButton(i, j).getBackground();
                        getButton(i, j).setBackground(getButton(i+1, j).getBackground());
                        getButton(i+1, j).setBackground(ct);
                        int tmp=MainArray[i][j];
                        MainArray[i][j]=MainArray[i+1][j];
                        MainArray[i+1][j]=tmp;
                        i=9;
                    }
                }
            }
        }
        delete();
        Random();
        CheckFirst();
    }
    public void MoveCounter(){
       if(exsist1){
           Move.setText(String.valueOf(++MoveCount));
           exsist1=!exsist1;
       }
    }
    public void play(int x , int y){
        if(First==Second){
            check[x][y]=true;
            A.Sa =x;
            A.So =y;
            First = !First;
        }else{
         if(check[x][y]==false){
             B.Sa=x;
             B.So=y;
             if(A.Sa==B.Sa&&(A.So-B.So==1||B.So-A.So==1)){
             Switch(); 
             delete();
             Down();
             Win();
             MoveCounter();
             Second=!Second;
             check[A.Sa][A.So]=false;
             }else if(A.So==B.So&&(A.Sa-B.Sa==1||B.Sa-A.Sa==1)){
             Switch();
             delete();
             Down();
             Win();
             MoveCounter();
             Second=!Second;
             check[A.Sa][A.So]=false;    
             }else{
             JOptionPane.showMessageDialog(null, "You Can't Choose this Button!", "Error", JOptionPane.INFORMATION_MESSAGE);    
             }
         }else{
             JOptionPane.showMessageDialog(null, "You Can't Choose this Button!", "Error", JOptionPane.INFORMATION_MESSAGE);
         }   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        _0_0 = new javax.swing.JButton();
        _1_0 = new javax.swing.JButton();
        _2_0 = new javax.swing.JButton();
        _3_0 = new javax.swing.JButton();
        _4_0 = new javax.swing.JButton();
        _5_0 = new javax.swing.JButton();
        _6_0 = new javax.swing.JButton();
        _7_0 = new javax.swing.JButton();
        _9_0 = new javax.swing.JButton();
        _8_0 = new javax.swing.JButton();
        _0_1 = new javax.swing.JButton();
        _1_1 = new javax.swing.JButton();
        _2_1 = new javax.swing.JButton();
        _3_1 = new javax.swing.JButton();
        _4_1 = new javax.swing.JButton();
        _5_1 = new javax.swing.JButton();
        _6_1 = new javax.swing.JButton();
        _7_1 = new javax.swing.JButton();
        _9_1 = new javax.swing.JButton();
        _8_1 = new javax.swing.JButton();
        _0_2 = new javax.swing.JButton();
        _1_2 = new javax.swing.JButton();
        _2_2 = new javax.swing.JButton();
        _3_2 = new javax.swing.JButton();
        _4_2 = new javax.swing.JButton();
        _5_2 = new javax.swing.JButton();
        _6_2 = new javax.swing.JButton();
        _7_2 = new javax.swing.JButton();
        _8_2 = new javax.swing.JButton();
        _9_2 = new javax.swing.JButton();
        _7_3 = new javax.swing.JButton();
        _4_3 = new javax.swing.JButton();
        _0_3 = new javax.swing.JButton();
        _6_3 = new javax.swing.JButton();
        _8_3 = new javax.swing.JButton();
        _5_3 = new javax.swing.JButton();
        _2_3 = new javax.swing.JButton();
        _9_3 = new javax.swing.JButton();
        _1_3 = new javax.swing.JButton();
        _3_3 = new javax.swing.JButton();
        _7_4 = new javax.swing.JButton();
        _4_4 = new javax.swing.JButton();
        _2_4 = new javax.swing.JButton();
        _3_4 = new javax.swing.JButton();
        _9_4 = new javax.swing.JButton();
        _6_4 = new javax.swing.JButton();
        _8_4 = new javax.swing.JButton();
        _1_4 = new javax.swing.JButton();
        _0_4 = new javax.swing.JButton();
        _5_4 = new javax.swing.JButton();
        _2_5 = new javax.swing.JButton();
        _0_5 = new javax.swing.JButton();
        _4_5 = new javax.swing.JButton();
        _5_5 = new javax.swing.JButton();
        _3_5 = new javax.swing.JButton();
        _8_5 = new javax.swing.JButton();
        _7_5 = new javax.swing.JButton();
        _1_5 = new javax.swing.JButton();
        _9_5 = new javax.swing.JButton();
        _6_5 = new javax.swing.JButton();
        _4_6 = new javax.swing.JButton();
        _5_6 = new javax.swing.JButton();
        _0_6 = new javax.swing.JButton();
        _9_6 = new javax.swing.JButton();
        _6_6 = new javax.swing.JButton();
        _1_6 = new javax.swing.JButton();
        _2_6 = new javax.swing.JButton();
        _3_6 = new javax.swing.JButton();
        _8_6 = new javax.swing.JButton();
        _7_6 = new javax.swing.JButton();
        _6_7 = new javax.swing.JButton();
        _2_7 = new javax.swing.JButton();
        _5_7 = new javax.swing.JButton();
        _1_7 = new javax.swing.JButton();
        _9_7 = new javax.swing.JButton();
        _7_7 = new javax.swing.JButton();
        _8_7 = new javax.swing.JButton();
        _4_7 = new javax.swing.JButton();
        _0_7 = new javax.swing.JButton();
        _3_7 = new javax.swing.JButton();
        _6_8 = new javax.swing.JButton();
        _2_8 = new javax.swing.JButton();
        _5_8 = new javax.swing.JButton();
        _1_8 = new javax.swing.JButton();
        _9_8 = new javax.swing.JButton();
        _7_8 = new javax.swing.JButton();
        _8_8 = new javax.swing.JButton();
        _4_8 = new javax.swing.JButton();
        _0_8 = new javax.swing.JButton();
        _3_8 = new javax.swing.JButton();
        _6_9 = new javax.swing.JButton();
        _2_9 = new javax.swing.JButton();
        _5_9 = new javax.swing.JButton();
        _1_9 = new javax.swing.JButton();
        _9_9 = new javax.swing.JButton();
        _7_9 = new javax.swing.JButton();
        _8_9 = new javax.swing.JButton();
        _4_9 = new javax.swing.JButton();
        _0_9 = new javax.swing.JButton();
        _3_9 = new javax.swing.JButton();
        PName = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        ScoreBoard = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();
        MoveBoard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candy Crush", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        _0_0.setBackground(new java.awt.Color(255, 255, 255));
        _0_0.setForeground(new java.awt.Color(255, 255, 255));
        _0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_0ActionPerformed(evt);
            }
        });

        _1_0.setBackground(new java.awt.Color(255, 255, 255));
        _1_0.setForeground(new java.awt.Color(255, 255, 255));
        _1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_0ActionPerformed(evt);
            }
        });

        _2_0.setBackground(new java.awt.Color(255, 255, 255));
        _2_0.setForeground(new java.awt.Color(255, 255, 255));
        _2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_0ActionPerformed(evt);
            }
        });

        _3_0.setBackground(new java.awt.Color(255, 255, 255));
        _3_0.setForeground(new java.awt.Color(255, 255, 255));
        _3_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_0ActionPerformed(evt);
            }
        });

        _4_0.setBackground(new java.awt.Color(255, 255, 255));
        _4_0.setForeground(new java.awt.Color(255, 255, 255));
        _4_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_0ActionPerformed(evt);
            }
        });

        _5_0.setBackground(new java.awt.Color(255, 255, 255));
        _5_0.setForeground(new java.awt.Color(255, 255, 255));
        _5_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_0ActionPerformed(evt);
            }
        });

        _6_0.setBackground(new java.awt.Color(255, 255, 255));
        _6_0.setForeground(new java.awt.Color(255, 255, 255));
        _6_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_0ActionPerformed(evt);
            }
        });

        _7_0.setBackground(new java.awt.Color(255, 255, 255));
        _7_0.setForeground(new java.awt.Color(255, 255, 255));
        _7_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_0ActionPerformed(evt);
            }
        });

        _9_0.setBackground(new java.awt.Color(255, 255, 255));
        _9_0.setForeground(new java.awt.Color(255, 255, 255));
        _9_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_0ActionPerformed(evt);
            }
        });

        _8_0.setBackground(new java.awt.Color(255, 255, 255));
        _8_0.setForeground(new java.awt.Color(255, 255, 255));
        _8_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_0ActionPerformed(evt);
            }
        });

        _0_1.setBackground(new java.awt.Color(255, 255, 255));
        _0_1.setForeground(new java.awt.Color(255, 255, 255));
        _0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_1ActionPerformed(evt);
            }
        });

        _1_1.setBackground(new java.awt.Color(255, 255, 255));
        _1_1.setForeground(new java.awt.Color(255, 255, 255));
        _1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_1ActionPerformed(evt);
            }
        });

        _2_1.setBackground(new java.awt.Color(255, 255, 255));
        _2_1.setForeground(new java.awt.Color(255, 255, 255));
        _2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_1ActionPerformed(evt);
            }
        });

        _3_1.setBackground(new java.awt.Color(255, 255, 255));
        _3_1.setForeground(new java.awt.Color(255, 255, 255));
        _3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_1ActionPerformed(evt);
            }
        });

        _4_1.setBackground(new java.awt.Color(255, 255, 255));
        _4_1.setForeground(new java.awt.Color(255, 255, 255));
        _4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_1ActionPerformed(evt);
            }
        });

        _5_1.setBackground(new java.awt.Color(255, 255, 255));
        _5_1.setForeground(new java.awt.Color(255, 255, 255));
        _5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_1ActionPerformed(evt);
            }
        });

        _6_1.setBackground(new java.awt.Color(255, 255, 255));
        _6_1.setForeground(new java.awt.Color(255, 255, 255));
        _6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_1ActionPerformed(evt);
            }
        });

        _7_1.setBackground(new java.awt.Color(255, 255, 255));
        _7_1.setForeground(new java.awt.Color(255, 255, 255));
        _7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_1ActionPerformed(evt);
            }
        });

        _9_1.setBackground(new java.awt.Color(255, 255, 255));
        _9_1.setForeground(new java.awt.Color(255, 255, 255));
        _9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_1ActionPerformed(evt);
            }
        });

        _8_1.setBackground(new java.awt.Color(255, 255, 255));
        _8_1.setForeground(new java.awt.Color(255, 255, 255));
        _8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_1ActionPerformed(evt);
            }
        });

        _0_2.setBackground(new java.awt.Color(255, 255, 255));
        _0_2.setForeground(new java.awt.Color(255, 255, 255));
        _0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_2ActionPerformed(evt);
            }
        });

        _1_2.setBackground(new java.awt.Color(255, 255, 255));
        _1_2.setForeground(new java.awt.Color(255, 255, 255));
        _1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_2ActionPerformed(evt);
            }
        });

        _2_2.setBackground(new java.awt.Color(255, 255, 255));
        _2_2.setForeground(new java.awt.Color(255, 255, 255));
        _2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_2ActionPerformed(evt);
            }
        });

        _3_2.setBackground(new java.awt.Color(255, 255, 255));
        _3_2.setForeground(new java.awt.Color(255, 255, 255));
        _3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_2ActionPerformed(evt);
            }
        });

        _4_2.setBackground(new java.awt.Color(255, 255, 255));
        _4_2.setForeground(new java.awt.Color(255, 255, 255));
        _4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_2ActionPerformed(evt);
            }
        });

        _5_2.setBackground(new java.awt.Color(255, 255, 255));
        _5_2.setForeground(new java.awt.Color(255, 255, 255));
        _5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_2ActionPerformed(evt);
            }
        });

        _6_2.setBackground(new java.awt.Color(255, 255, 255));
        _6_2.setForeground(new java.awt.Color(255, 255, 255));
        _6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_2ActionPerformed(evt);
            }
        });

        _7_2.setBackground(new java.awt.Color(255, 255, 255));
        _7_2.setForeground(new java.awt.Color(255, 255, 255));
        _7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_2ActionPerformed(evt);
            }
        });

        _8_2.setBackground(new java.awt.Color(255, 255, 255));
        _8_2.setForeground(new java.awt.Color(255, 255, 255));
        _8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_2ActionPerformed(evt);
            }
        });

        _9_2.setBackground(new java.awt.Color(255, 255, 255));
        _9_2.setForeground(new java.awt.Color(255, 255, 255));
        _9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_2ActionPerformed(evt);
            }
        });

        _7_3.setBackground(new java.awt.Color(255, 255, 255));
        _7_3.setForeground(new java.awt.Color(255, 255, 255));
        _7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_3ActionPerformed(evt);
            }
        });

        _4_3.setBackground(new java.awt.Color(255, 255, 255));
        _4_3.setForeground(new java.awt.Color(255, 255, 255));
        _4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_3ActionPerformed(evt);
            }
        });

        _0_3.setBackground(new java.awt.Color(255, 255, 255));
        _0_3.setForeground(new java.awt.Color(255, 255, 255));
        _0_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_3ActionPerformed(evt);
            }
        });

        _6_3.setBackground(new java.awt.Color(255, 255, 255));
        _6_3.setForeground(new java.awt.Color(255, 255, 255));
        _6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_3ActionPerformed(evt);
            }
        });

        _8_3.setBackground(new java.awt.Color(255, 255, 255));
        _8_3.setForeground(new java.awt.Color(255, 255, 255));
        _8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_3ActionPerformed(evt);
            }
        });

        _5_3.setBackground(new java.awt.Color(255, 255, 255));
        _5_3.setForeground(new java.awt.Color(255, 255, 255));
        _5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_3ActionPerformed(evt);
            }
        });

        _2_3.setBackground(new java.awt.Color(255, 255, 255));
        _2_3.setForeground(new java.awt.Color(255, 255, 255));
        _2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_3ActionPerformed(evt);
            }
        });

        _9_3.setBackground(new java.awt.Color(255, 255, 255));
        _9_3.setForeground(new java.awt.Color(255, 255, 255));
        _9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_3ActionPerformed(evt);
            }
        });

        _1_3.setBackground(new java.awt.Color(255, 255, 255));
        _1_3.setForeground(new java.awt.Color(255, 255, 255));
        _1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_3ActionPerformed(evt);
            }
        });

        _3_3.setBackground(new java.awt.Color(255, 255, 255));
        _3_3.setForeground(new java.awt.Color(255, 255, 255));
        _3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_3ActionPerformed(evt);
            }
        });

        _7_4.setBackground(new java.awt.Color(255, 255, 255));
        _7_4.setForeground(new java.awt.Color(255, 255, 255));
        _7_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_4ActionPerformed(evt);
            }
        });

        _4_4.setBackground(new java.awt.Color(255, 255, 255));
        _4_4.setForeground(new java.awt.Color(255, 255, 255));
        _4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_4ActionPerformed(evt);
            }
        });

        _2_4.setBackground(new java.awt.Color(255, 255, 255));
        _2_4.setForeground(new java.awt.Color(255, 255, 255));
        _2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_4ActionPerformed(evt);
            }
        });

        _3_4.setBackground(new java.awt.Color(255, 255, 255));
        _3_4.setForeground(new java.awt.Color(255, 255, 255));
        _3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_4ActionPerformed(evt);
            }
        });

        _9_4.setBackground(new java.awt.Color(255, 255, 255));
        _9_4.setForeground(new java.awt.Color(255, 255, 255));
        _9_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_4ActionPerformed(evt);
            }
        });

        _6_4.setBackground(new java.awt.Color(255, 255, 255));
        _6_4.setForeground(new java.awt.Color(255, 255, 255));
        _6_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_4ActionPerformed(evt);
            }
        });

        _8_4.setBackground(new java.awt.Color(255, 255, 255));
        _8_4.setForeground(new java.awt.Color(255, 255, 255));
        _8_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_4ActionPerformed(evt);
            }
        });

        _1_4.setBackground(new java.awt.Color(255, 255, 255));
        _1_4.setForeground(new java.awt.Color(255, 255, 255));
        _1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_4ActionPerformed(evt);
            }
        });

        _0_4.setBackground(new java.awt.Color(255, 255, 255));
        _0_4.setForeground(new java.awt.Color(255, 255, 255));
        _0_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_4ActionPerformed(evt);
            }
        });

        _5_4.setBackground(new java.awt.Color(255, 255, 255));
        _5_4.setForeground(new java.awt.Color(255, 255, 255));
        _5_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_4ActionPerformed(evt);
            }
        });

        _2_5.setBackground(new java.awt.Color(255, 255, 255));
        _2_5.setForeground(new java.awt.Color(255, 255, 255));
        _2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_5ActionPerformed(evt);
            }
        });

        _0_5.setBackground(new java.awt.Color(255, 255, 255));
        _0_5.setForeground(new java.awt.Color(255, 255, 255));
        _0_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_5ActionPerformed(evt);
            }
        });

        _4_5.setBackground(new java.awt.Color(255, 255, 255));
        _4_5.setForeground(new java.awt.Color(255, 255, 255));
        _4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_5ActionPerformed(evt);
            }
        });

        _5_5.setBackground(new java.awt.Color(255, 255, 255));
        _5_5.setForeground(new java.awt.Color(255, 255, 255));
        _5_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_5ActionPerformed(evt);
            }
        });

        _3_5.setBackground(new java.awt.Color(255, 255, 255));
        _3_5.setForeground(new java.awt.Color(255, 255, 255));
        _3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_5ActionPerformed(evt);
            }
        });

        _8_5.setBackground(new java.awt.Color(255, 255, 255));
        _8_5.setForeground(new java.awt.Color(255, 255, 255));
        _8_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_5ActionPerformed(evt);
            }
        });

        _7_5.setBackground(new java.awt.Color(255, 255, 255));
        _7_5.setForeground(new java.awt.Color(255, 255, 255));
        _7_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_5ActionPerformed(evt);
            }
        });

        _1_5.setBackground(new java.awt.Color(255, 255, 255));
        _1_5.setForeground(new java.awt.Color(255, 255, 255));
        _1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_5ActionPerformed(evt);
            }
        });

        _9_5.setBackground(new java.awt.Color(255, 255, 255));
        _9_5.setForeground(new java.awt.Color(255, 255, 255));
        _9_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_5ActionPerformed(evt);
            }
        });

        _6_5.setBackground(new java.awt.Color(255, 255, 255));
        _6_5.setForeground(new java.awt.Color(255, 255, 255));
        _6_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_5ActionPerformed(evt);
            }
        });

        _4_6.setBackground(new java.awt.Color(255, 255, 255));
        _4_6.setForeground(new java.awt.Color(255, 255, 255));
        _4_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_6ActionPerformed(evt);
            }
        });

        _5_6.setBackground(new java.awt.Color(255, 255, 255));
        _5_6.setForeground(new java.awt.Color(255, 255, 255));
        _5_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_6ActionPerformed(evt);
            }
        });

        _0_6.setBackground(new java.awt.Color(255, 255, 255));
        _0_6.setForeground(new java.awt.Color(255, 255, 255));
        _0_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_6ActionPerformed(evt);
            }
        });

        _9_6.setBackground(new java.awt.Color(255, 255, 255));
        _9_6.setForeground(new java.awt.Color(255, 255, 255));
        _9_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_6ActionPerformed(evt);
            }
        });

        _6_6.setBackground(new java.awt.Color(255, 255, 255));
        _6_6.setForeground(new java.awt.Color(255, 255, 255));
        _6_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_6ActionPerformed(evt);
            }
        });

        _1_6.setBackground(new java.awt.Color(255, 255, 255));
        _1_6.setForeground(new java.awt.Color(255, 255, 255));
        _1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_6ActionPerformed(evt);
            }
        });

        _2_6.setBackground(new java.awt.Color(255, 255, 255));
        _2_6.setForeground(new java.awt.Color(255, 255, 255));
        _2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_6ActionPerformed(evt);
            }
        });

        _3_6.setBackground(new java.awt.Color(255, 255, 255));
        _3_6.setForeground(new java.awt.Color(255, 255, 255));
        _3_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_6ActionPerformed(evt);
            }
        });

        _8_6.setBackground(new java.awt.Color(255, 255, 255));
        _8_6.setForeground(new java.awt.Color(255, 255, 255));
        _8_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_6ActionPerformed(evt);
            }
        });

        _7_6.setBackground(new java.awt.Color(255, 255, 255));
        _7_6.setForeground(new java.awt.Color(255, 255, 255));
        _7_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_6ActionPerformed(evt);
            }
        });

        _6_7.setBackground(new java.awt.Color(255, 255, 255));
        _6_7.setForeground(new java.awt.Color(255, 255, 255));
        _6_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_7ActionPerformed(evt);
            }
        });

        _2_7.setBackground(new java.awt.Color(255, 255, 255));
        _2_7.setForeground(new java.awt.Color(255, 255, 255));
        _2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_7ActionPerformed(evt);
            }
        });

        _5_7.setBackground(new java.awt.Color(255, 255, 255));
        _5_7.setForeground(new java.awt.Color(255, 255, 255));
        _5_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_7ActionPerformed(evt);
            }
        });

        _1_7.setBackground(new java.awt.Color(255, 255, 255));
        _1_7.setForeground(new java.awt.Color(255, 255, 255));
        _1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_7ActionPerformed(evt);
            }
        });

        _9_7.setBackground(new java.awt.Color(255, 255, 255));
        _9_7.setForeground(new java.awt.Color(255, 255, 255));
        _9_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_7ActionPerformed(evt);
            }
        });

        _7_7.setBackground(new java.awt.Color(255, 255, 255));
        _7_7.setForeground(new java.awt.Color(255, 255, 255));
        _7_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_7ActionPerformed(evt);
            }
        });

        _8_7.setBackground(new java.awt.Color(255, 255, 255));
        _8_7.setForeground(new java.awt.Color(255, 255, 255));
        _8_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_7ActionPerformed(evt);
            }
        });

        _4_7.setBackground(new java.awt.Color(255, 255, 255));
        _4_7.setForeground(new java.awt.Color(255, 255, 255));
        _4_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_7ActionPerformed(evt);
            }
        });

        _0_7.setBackground(new java.awt.Color(255, 255, 255));
        _0_7.setForeground(new java.awt.Color(255, 255, 255));
        _0_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_7ActionPerformed(evt);
            }
        });

        _3_7.setBackground(new java.awt.Color(255, 255, 255));
        _3_7.setForeground(new java.awt.Color(255, 255, 255));
        _3_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_7ActionPerformed(evt);
            }
        });

        _6_8.setBackground(new java.awt.Color(255, 255, 255));
        _6_8.setForeground(new java.awt.Color(255, 255, 255));
        _6_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_8ActionPerformed(evt);
            }
        });

        _2_8.setBackground(new java.awt.Color(255, 255, 255));
        _2_8.setForeground(new java.awt.Color(255, 255, 255));
        _2_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_8ActionPerformed(evt);
            }
        });

        _5_8.setBackground(new java.awt.Color(255, 255, 255));
        _5_8.setForeground(new java.awt.Color(255, 255, 255));
        _5_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_8ActionPerformed(evt);
            }
        });

        _1_8.setBackground(new java.awt.Color(255, 255, 255));
        _1_8.setForeground(new java.awt.Color(255, 255, 255));
        _1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_8ActionPerformed(evt);
            }
        });

        _9_8.setBackground(new java.awt.Color(255, 255, 255));
        _9_8.setForeground(new java.awt.Color(255, 255, 255));
        _9_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_8ActionPerformed(evt);
            }
        });

        _7_8.setBackground(new java.awt.Color(255, 255, 255));
        _7_8.setForeground(new java.awt.Color(255, 255, 255));
        _7_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_8ActionPerformed(evt);
            }
        });

        _8_8.setBackground(new java.awt.Color(255, 255, 255));
        _8_8.setForeground(new java.awt.Color(255, 255, 255));
        _8_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_8ActionPerformed(evt);
            }
        });

        _4_8.setBackground(new java.awt.Color(255, 255, 255));
        _4_8.setForeground(new java.awt.Color(255, 255, 255));
        _4_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_8ActionPerformed(evt);
            }
        });

        _0_8.setBackground(new java.awt.Color(255, 255, 255));
        _0_8.setForeground(new java.awt.Color(255, 255, 255));
        _0_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_8ActionPerformed(evt);
            }
        });

        _3_8.setBackground(new java.awt.Color(255, 255, 255));
        _3_8.setForeground(new java.awt.Color(255, 255, 255));
        _3_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_8ActionPerformed(evt);
            }
        });

        _6_9.setBackground(new java.awt.Color(255, 255, 255));
        _6_9.setForeground(new java.awt.Color(255, 255, 255));
        _6_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_9ActionPerformed(evt);
            }
        });

        _2_9.setBackground(new java.awt.Color(255, 255, 255));
        _2_9.setForeground(new java.awt.Color(255, 255, 255));
        _2_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_9ActionPerformed(evt);
            }
        });

        _5_9.setBackground(new java.awt.Color(255, 255, 255));
        _5_9.setForeground(new java.awt.Color(255, 255, 255));
        _5_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_9ActionPerformed(evt);
            }
        });

        _1_9.setBackground(new java.awt.Color(255, 255, 255));
        _1_9.setForeground(new java.awt.Color(255, 255, 255));
        _1_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_9ActionPerformed(evt);
            }
        });

        _9_9.setBackground(new java.awt.Color(255, 255, 255));
        _9_9.setForeground(new java.awt.Color(255, 255, 255));
        _9_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_9ActionPerformed(evt);
            }
        });

        _7_9.setBackground(new java.awt.Color(255, 255, 255));
        _7_9.setForeground(new java.awt.Color(255, 255, 255));
        _7_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_9ActionPerformed(evt);
            }
        });

        _8_9.setBackground(new java.awt.Color(255, 255, 255));
        _8_9.setForeground(new java.awt.Color(255, 255, 255));
        _8_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_9ActionPerformed(evt);
            }
        });

        _4_9.setBackground(new java.awt.Color(255, 255, 255));
        _4_9.setForeground(new java.awt.Color(255, 255, 255));
        _4_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_9ActionPerformed(evt);
            }
        });

        _0_9.setBackground(new java.awt.Color(255, 255, 255));
        _0_9.setForeground(new java.awt.Color(255, 255, 255));
        _0_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_9ActionPerformed(evt);
            }
        });

        _3_9.setBackground(new java.awt.Color(255, 255, 255));
        _3_9.setForeground(new java.awt.Color(255, 255, 255));
        _3_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_9ActionPerformed(evt);
            }
        });

        PName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PName.setForeground(new java.awt.Color(255, 255, 255));
        PName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PName.setText("Player Name");

        Start.setBackground(new java.awt.Color(51, 51, 51));
        Start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Start.setForeground(new java.awt.Color(255, 255, 255));
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        ScoreBoard.setForeground(new java.awt.Color(255, 255, 255));
        ScoreBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreBoard.setText("Score");

        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText("0");

        Move.setForeground(new java.awt.Color(255, 255, 255));
        Move.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move.setText("0");

        MoveBoard.setForeground(new java.awt.Color(255, 255, 255));
        MoveBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoveBoard.setText("Move");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_0_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(_0_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(_8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(_7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MoveBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_0_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(ScoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(MoveBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

      Random();
      CheckFirst();
  
    }//GEN-LAST:event_StartActionPerformed

    private void _0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_0ActionPerformed
        play(0,0);
    }//GEN-LAST:event__0_0ActionPerformed

    private void _0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_1ActionPerformed
        play(0,1);
    }//GEN-LAST:event__0_1ActionPerformed

    private void _0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_2ActionPerformed
        play(0,2);
    }//GEN-LAST:event__0_2ActionPerformed

    private void _0_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_3ActionPerformed
        play(0,3);
    }//GEN-LAST:event__0_3ActionPerformed

    private void _0_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_4ActionPerformed
        play(0,4);
    }//GEN-LAST:event__0_4ActionPerformed

    private void _0_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_5ActionPerformed
        play(0,5);
    }//GEN-LAST:event__0_5ActionPerformed

    private void _0_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_6ActionPerformed
        play(0,6);
    }//GEN-LAST:event__0_6ActionPerformed

    private void _0_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_7ActionPerformed
        play(0,7);
    }//GEN-LAST:event__0_7ActionPerformed

    private void _0_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_8ActionPerformed
        play(0,8);
    }//GEN-LAST:event__0_8ActionPerformed

    private void _0_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_9ActionPerformed
        play(0,9);
    }//GEN-LAST:event__0_9ActionPerformed

    private void _1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_0ActionPerformed
        play(1,0);
    }//GEN-LAST:event__1_0ActionPerformed

    private void _1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_1ActionPerformed
        play(1,1);
    }//GEN-LAST:event__1_1ActionPerformed

    private void _1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_2ActionPerformed
        play(1,2);
    }//GEN-LAST:event__1_2ActionPerformed

    private void _1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_3ActionPerformed
        play(1,3);
    }//GEN-LAST:event__1_3ActionPerformed

    private void _1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_4ActionPerformed
        play(1,4);
    }//GEN-LAST:event__1_4ActionPerformed

    private void _1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_5ActionPerformed
        play(1,5);
    }//GEN-LAST:event__1_5ActionPerformed

    private void _1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_6ActionPerformed
        play(1,6);
    }//GEN-LAST:event__1_6ActionPerformed

    private void _1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_7ActionPerformed
        play(1,7);
    }//GEN-LAST:event__1_7ActionPerformed

    private void _1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_8ActionPerformed
        play(1,8);
    }//GEN-LAST:event__1_8ActionPerformed

    private void _1_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_9ActionPerformed
        play(1,9);
    }//GEN-LAST:event__1_9ActionPerformed

    private void _2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_0ActionPerformed
        play(2,0);
    }//GEN-LAST:event__2_0ActionPerformed

    private void _2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_1ActionPerformed
        play(2,1);
    }//GEN-LAST:event__2_1ActionPerformed

    private void _2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_2ActionPerformed
        play(2,2);
    }//GEN-LAST:event__2_2ActionPerformed

    private void _2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_3ActionPerformed
        play(2,3);
    }//GEN-LAST:event__2_3ActionPerformed

    private void _2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_4ActionPerformed
        play(2,4);
    }//GEN-LAST:event__2_4ActionPerformed

    private void _2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_5ActionPerformed
        play(2,5);
    }//GEN-LAST:event__2_5ActionPerformed

    private void _2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_6ActionPerformed
        play(2,6);
    }//GEN-LAST:event__2_6ActionPerformed

    private void _2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_7ActionPerformed
        play(2,7);
    }//GEN-LAST:event__2_7ActionPerformed

    private void _2_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_8ActionPerformed
        play(2,8);
    }//GEN-LAST:event__2_8ActionPerformed

    private void _2_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_9ActionPerformed
        play(2,9);
    }//GEN-LAST:event__2_9ActionPerformed

    private void _3_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_0ActionPerformed
        play(3,0);
    }//GEN-LAST:event__3_0ActionPerformed

    private void _3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_1ActionPerformed
        play(3,1);
    }//GEN-LAST:event__3_1ActionPerformed

    private void _3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_2ActionPerformed
        play(3,2);
    }//GEN-LAST:event__3_2ActionPerformed

    private void _3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_3ActionPerformed
        play(3,3);
    }//GEN-LAST:event__3_3ActionPerformed

    private void _3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_4ActionPerformed
        play(3,4);
    }//GEN-LAST:event__3_4ActionPerformed

    private void _3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_5ActionPerformed
        play(3,5);
    }//GEN-LAST:event__3_5ActionPerformed

    private void _3_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_6ActionPerformed
        play(3,6);
    }//GEN-LAST:event__3_6ActionPerformed

    private void _3_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_7ActionPerformed
        play(3,7);
    }//GEN-LAST:event__3_7ActionPerformed

    private void _3_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_8ActionPerformed
        play(3,8);
    }//GEN-LAST:event__3_8ActionPerformed

    private void _3_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_9ActionPerformed
        play(3,9);
    }//GEN-LAST:event__3_9ActionPerformed

    private void _4_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_0ActionPerformed
        play(4,0);
    }//GEN-LAST:event__4_0ActionPerformed

    private void _4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_1ActionPerformed
        play(4,1);
    }//GEN-LAST:event__4_1ActionPerformed

    private void _4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_2ActionPerformed
        play(4,2);
    }//GEN-LAST:event__4_2ActionPerformed

    private void _4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_3ActionPerformed
        play(4,3);
    }//GEN-LAST:event__4_3ActionPerformed

    private void _4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_4ActionPerformed
        play(4,4);
    }//GEN-LAST:event__4_4ActionPerformed

    private void _4_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_5ActionPerformed
        play(4,5);
    }//GEN-LAST:event__4_5ActionPerformed

    private void _4_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_6ActionPerformed
        play(4,6);
    }//GEN-LAST:event__4_6ActionPerformed

    private void _4_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_7ActionPerformed
        play(4,7);
    }//GEN-LAST:event__4_7ActionPerformed

    private void _4_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_8ActionPerformed
        play(4,8);
    }//GEN-LAST:event__4_8ActionPerformed

    private void _4_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_9ActionPerformed
        play(4,9);
    }//GEN-LAST:event__4_9ActionPerformed

    private void _5_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_0ActionPerformed
        play(5,0);
    }//GEN-LAST:event__5_0ActionPerformed

    private void _5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_1ActionPerformed
        play(5,1);
    }//GEN-LAST:event__5_1ActionPerformed

    private void _5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_2ActionPerformed
        play(5,2);
    }//GEN-LAST:event__5_2ActionPerformed

    private void _5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_3ActionPerformed
        play(5,3);
    }//GEN-LAST:event__5_3ActionPerformed

    private void _5_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_4ActionPerformed
        play(5,4);
    }//GEN-LAST:event__5_4ActionPerformed

    private void _5_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_5ActionPerformed
        play(5,5);
    }//GEN-LAST:event__5_5ActionPerformed

    private void _5_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_6ActionPerformed
        play(5,6);
    }//GEN-LAST:event__5_6ActionPerformed

    private void _5_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_7ActionPerformed
        play(5,7);
    }//GEN-LAST:event__5_7ActionPerformed

    private void _5_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_8ActionPerformed
        play(5,8);
    }//GEN-LAST:event__5_8ActionPerformed

    private void _5_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_9ActionPerformed
        play(5,9);
    }//GEN-LAST:event__5_9ActionPerformed

    private void _6_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_0ActionPerformed
        play(6,0);
    }//GEN-LAST:event__6_0ActionPerformed

    private void _6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_1ActionPerformed
        play(6,1);
    }//GEN-LAST:event__6_1ActionPerformed

    private void _6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_2ActionPerformed
        play(6,2);
    }//GEN-LAST:event__6_2ActionPerformed

    private void _6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_3ActionPerformed
        play(6,3);
    }//GEN-LAST:event__6_3ActionPerformed

    private void _6_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_4ActionPerformed
        play(6,4);
    }//GEN-LAST:event__6_4ActionPerformed

    private void _6_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_5ActionPerformed
        play(6,5);
    }//GEN-LAST:event__6_5ActionPerformed

    private void _6_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_6ActionPerformed
        play(6,6);
    }//GEN-LAST:event__6_6ActionPerformed

    private void _6_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_7ActionPerformed
        play(6,7);
    }//GEN-LAST:event__6_7ActionPerformed

    private void _6_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_8ActionPerformed
        play(6,8);
    }//GEN-LAST:event__6_8ActionPerformed

    private void _6_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_9ActionPerformed
        play(6,9);
    }//GEN-LAST:event__6_9ActionPerformed

    private void _7_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_0ActionPerformed
        play(7,0);
    }//GEN-LAST:event__7_0ActionPerformed

    private void _7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_1ActionPerformed
        play(7,1);
    }//GEN-LAST:event__7_1ActionPerformed

    private void _7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_2ActionPerformed
        play(7,2);
    }//GEN-LAST:event__7_2ActionPerformed

    private void _7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_3ActionPerformed
        play(7,3);
    }//GEN-LAST:event__7_3ActionPerformed

    private void _7_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_4ActionPerformed
        play(7,4);
    }//GEN-LAST:event__7_4ActionPerformed

    private void _7_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_5ActionPerformed
        play(7,5);
    }//GEN-LAST:event__7_5ActionPerformed

    private void _7_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_6ActionPerformed
        play(7,6);
    }//GEN-LAST:event__7_6ActionPerformed

    private void _7_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_7ActionPerformed
        play(7,7);
    }//GEN-LAST:event__7_7ActionPerformed

    private void _7_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_8ActionPerformed
        play(7,8);
    }//GEN-LAST:event__7_8ActionPerformed

    private void _7_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_9ActionPerformed
        play(7,9);
    }//GEN-LAST:event__7_9ActionPerformed

    private void _8_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_0ActionPerformed
        play(8,0);
    }//GEN-LAST:event__8_0ActionPerformed

    private void _8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_1ActionPerformed
        play(8,1);
    }//GEN-LAST:event__8_1ActionPerformed

    private void _8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_2ActionPerformed
        play(8,2);
    }//GEN-LAST:event__8_2ActionPerformed

    private void _8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_3ActionPerformed
        play(8,3);
    }//GEN-LAST:event__8_3ActionPerformed

    private void _8_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_4ActionPerformed
        play(8,4);
    }//GEN-LAST:event__8_4ActionPerformed

    private void _8_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_5ActionPerformed
        play(8,5);
    }//GEN-LAST:event__8_5ActionPerformed

    private void _8_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_6ActionPerformed
        play(8,6);
    }//GEN-LAST:event__8_6ActionPerformed

    private void _8_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_7ActionPerformed
        play(8,7);
    }//GEN-LAST:event__8_7ActionPerformed

    private void _8_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_8ActionPerformed
        play(8,8);
    }//GEN-LAST:event__8_8ActionPerformed

    private void _8_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_9ActionPerformed
        play(8,9);
    }//GEN-LAST:event__8_9ActionPerformed

    private void _9_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_0ActionPerformed
        play(9,0);
    }//GEN-LAST:event__9_0ActionPerformed

    private void _9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_1ActionPerformed
        play(9,1);
    }//GEN-LAST:event__9_1ActionPerformed

    private void _9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_2ActionPerformed
        play(9,2);
    }//GEN-LAST:event__9_2ActionPerformed

    private void _9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_3ActionPerformed
        play(9,3);
    }//GEN-LAST:event__9_3ActionPerformed

    private void _9_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_4ActionPerformed
        play(9,4);
    }//GEN-LAST:event__9_4ActionPerformed

    private void _9_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_5ActionPerformed
        play(9,5);
    }//GEN-LAST:event__9_5ActionPerformed

    private void _9_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_6ActionPerformed
        play(9,6);
    }//GEN-LAST:event__9_6ActionPerformed

    private void _9_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_7ActionPerformed
        play(9,7);
    }//GEN-LAST:event__9_7ActionPerformed

    private void _9_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_8ActionPerformed
        play(9,8);
    }//GEN-LAST:event__9_8ActionPerformed

    private void _9_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_9ActionPerformed
        play(9,9);
    }//GEN-LAST:event__9_9ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CandyCrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CandyCrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CandyCrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandyCrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CandyCrush().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CandyCrush.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Move;
    private javax.swing.JLabel MoveBoard;
    private javax.swing.JLabel PName;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel ScoreBoard;
    private javax.swing.JButton Start;
    private javax.swing.JButton _0_0;
    private javax.swing.JButton _0_1;
    private javax.swing.JButton _0_2;
    private javax.swing.JButton _0_3;
    private javax.swing.JButton _0_4;
    private javax.swing.JButton _0_5;
    private javax.swing.JButton _0_6;
    private javax.swing.JButton _0_7;
    private javax.swing.JButton _0_8;
    private javax.swing.JButton _0_9;
    private javax.swing.JButton _1_0;
    private javax.swing.JButton _1_1;
    private javax.swing.JButton _1_2;
    private javax.swing.JButton _1_3;
    private javax.swing.JButton _1_4;
    private javax.swing.JButton _1_5;
    private javax.swing.JButton _1_6;
    private javax.swing.JButton _1_7;
    private javax.swing.JButton _1_8;
    private javax.swing.JButton _1_9;
    private javax.swing.JButton _2_0;
    private javax.swing.JButton _2_1;
    private javax.swing.JButton _2_2;
    private javax.swing.JButton _2_3;
    private javax.swing.JButton _2_4;
    private javax.swing.JButton _2_5;
    private javax.swing.JButton _2_6;
    private javax.swing.JButton _2_7;
    private javax.swing.JButton _2_8;
    private javax.swing.JButton _2_9;
    private javax.swing.JButton _3_0;
    private javax.swing.JButton _3_1;
    private javax.swing.JButton _3_2;
    private javax.swing.JButton _3_3;
    private javax.swing.JButton _3_4;
    private javax.swing.JButton _3_5;
    private javax.swing.JButton _3_6;
    private javax.swing.JButton _3_7;
    private javax.swing.JButton _3_8;
    private javax.swing.JButton _3_9;
    private javax.swing.JButton _4_0;
    private javax.swing.JButton _4_1;
    private javax.swing.JButton _4_2;
    private javax.swing.JButton _4_3;
    private javax.swing.JButton _4_4;
    private javax.swing.JButton _4_5;
    private javax.swing.JButton _4_6;
    private javax.swing.JButton _4_7;
    private javax.swing.JButton _4_8;
    private javax.swing.JButton _4_9;
    private javax.swing.JButton _5_0;
    private javax.swing.JButton _5_1;
    private javax.swing.JButton _5_2;
    private javax.swing.JButton _5_3;
    private javax.swing.JButton _5_4;
    private javax.swing.JButton _5_5;
    private javax.swing.JButton _5_6;
    private javax.swing.JButton _5_7;
    private javax.swing.JButton _5_8;
    private javax.swing.JButton _5_9;
    private javax.swing.JButton _6_0;
    private javax.swing.JButton _6_1;
    private javax.swing.JButton _6_2;
    private javax.swing.JButton _6_3;
    private javax.swing.JButton _6_4;
    private javax.swing.JButton _6_5;
    private javax.swing.JButton _6_6;
    private javax.swing.JButton _6_7;
    private javax.swing.JButton _6_8;
    private javax.swing.JButton _6_9;
    private javax.swing.JButton _7_0;
    private javax.swing.JButton _7_1;
    private javax.swing.JButton _7_2;
    private javax.swing.JButton _7_3;
    private javax.swing.JButton _7_4;
    private javax.swing.JButton _7_5;
    private javax.swing.JButton _7_6;
    private javax.swing.JButton _7_7;
    private javax.swing.JButton _7_8;
    private javax.swing.JButton _7_9;
    private javax.swing.JButton _8_0;
    private javax.swing.JButton _8_1;
    private javax.swing.JButton _8_2;
    private javax.swing.JButton _8_3;
    private javax.swing.JButton _8_4;
    private javax.swing.JButton _8_5;
    private javax.swing.JButton _8_6;
    private javax.swing.JButton _8_7;
    private javax.swing.JButton _8_8;
    private javax.swing.JButton _8_9;
    private javax.swing.JButton _9_0;
    private javax.swing.JButton _9_1;
    private javax.swing.JButton _9_2;
    private javax.swing.JButton _9_3;
    private javax.swing.JButton _9_4;
    private javax.swing.JButton _9_5;
    private javax.swing.JButton _9_6;
    private javax.swing.JButton _9_7;
    private javax.swing.JButton _9_8;
    private javax.swing.JButton _9_9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
