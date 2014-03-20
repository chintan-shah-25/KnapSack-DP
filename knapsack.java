/*

public static void main(String[] args)
       {
        // TODO code application logic here
        sack a=new sack();
        int weight[]={6,3,4,2};
        int value[]={30,14,16,9};
        int max=a.maxValueNoRepeat(weight,value,10);
        System.out.println();
        int max_repeat=a.maxValueRepeat(weight,value,10);
        System.out.println();
        System.out.println("Max Capacity "+max);
        System.out.println("Max Capacity with repetition "+max_repeat);
        
        }
*/
 public int maxValueNoRepeat(int[]w, int[]v,int maxweight)
    {
      int items=v.length;
      int result[][]=new int[maxweight+1][items+1];
      for(int i=0;i<=maxweight;i++)                                      //when there are no items
          result[i][0]=0;
      for(int j=0;j<=items;j++)                                         //when weight is zero
          result[0][j]=0;
      for(int m=1;m<=items;m++)
          for(int n=1;n<=maxweight;n++)
          {
              if(w[m-1]>n)
                result[n][m]=result[n][m-1];
              else
              result[n][m]=Math.max(v[m-1]+result[n-w[m-1]][m-1], result[n][m-1]);

          }
  /*
      for(int i=0;i<=maxweight;i++)
      {
          System.out.println();
          for(int j=0;j<=items;j++)                                   //to print the table
          {
            System.out.print("\t"+result[i][j]);

          }
      }
  */
      return result[maxweight][items];
    }
    
/*                   Items

         0        1        2        3        4
         
      0  0        0        0        0        0
      1  0        0        0        0        0
      2  0        0        0        0        9
   w  3  0        0        14       14      14                        //Understanding
   e  4  0        0        14       16      16
   i  5  0        0        14       16      23
   g  6  0        30       30       30      30
   h  7  0        30       30       30      30
   t  8  0        30       30       30      39
      9  0        30       44       44      44
     10  0        30       44       46      46

*/
// If Repetitions are allowed

 public int maxValueRepeat(int[]w, int[]v,int maxweight)
    {
      int result[]=new int[maxweight+1];
      result[0]=0;
         for(int i=1;i<=maxweight;i++)
         {
             int max=0;

             for(int j=0;j<v.length;j++)
             {
                 if (w[j]>i)
                     continue;
                 else
                     max=result[i-w[j]]+ v[j];
                     
                 if(max>=result[i])
                     result[i]=max;

           }
        }
      for(int i=0;i<=maxweight;i++)                               //print table
          System.out.print("\t"+result[i]);
      return result[maxweight];
    }
  
  /*
 result(0) = 0
result(1) = 0
result(2) = max{result(2-2) + 9} = max{result(0) + 9}=max{0 + 9} = 9
result(3) = max{result(3-2) + 9, result(3-3) + 14} = max{9, 14} = 14
result(4) = max{result(4-2) + 9, result(4-3) + 14, result(4-4) + 16} = max{18, 14, 16} = 18
result(5) = max{result(5-2) + 9, result(5-3) + 14, result(5-4) + 16} = max{23, 23, 16} = 23
result(6) = max{result(6-2) + 9, result(6-3) + 14, result(6-4) + 16, result(6-6) + 30} = max{27, 28, 25, 30} = 30
result(7) = max{result(7-2) + 9, result(7-3) + 14, result(7-4) + 16, result(7-6) + 30} = max{32, 32, 30, 30} = 32
result(8) = max{result(8-2) + 9, result(8-3) + 14, result(8-4) + 16, result(8-6) + 30} = max{39, 37, 34, 39} = 39
result(9) = max{result(9-2) + 9, result(9-3) + 14, result(9-4) + 16, result(9-6) + 30} = max{41, 44, 39, 44} = 44
result(10) = max{result(10-2) + 9, result(10-3) + 14, result(10-4) + 16, result(10-6) + 30} = max{48, 46, 46, 48} = 48
  
  */  
  // 0        0        9        14       18        23        30        32        39        44        48  weight table
    
    
