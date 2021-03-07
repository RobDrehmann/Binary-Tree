public class Binarytree {
   private Node pointer;
   private Node root;
   private Node temp;
   private boolean found = false;
   private boolean check = true;
   
         
    public static void main(String[] args){
     Binarytree Tree = new Binarytree();
     Tree.insert(20);
     Tree.insert(10);
     Tree.insert(30);
     Tree.insert(5);
     Tree.insert(7);
     Tree.insert(21);
    
     Tree.dumptree();
     Tree.check = false;
     Tree.delete(20);
     Tree.delete(21);
     Tree.dumptree();
     Tree.delete(35);
     

      

     
     
     
      }
    
   public Binarytree()
   {
      root=null;
      pointer=null;
     
    }
    
    
    public void insert(int val){
      if(root == null){    
         root = new Node();
         root.value = val;
      }else{   
         pointer = root;
         compareins(val);
         pointer = root;
     }
   }
               
     public void compareins(int val){
      if(pointer.value > val){
            if(pointer.left == null){
               pointer.left = new Node();
               pointer = pointer.left;
               pointer.value = val;
            }else{ 
               pointer = pointer.left;
               compareins(val);
            }
       }else if(pointer.value < val){
          if(pointer.right == null){
               pointer.right = new Node();
               pointer = pointer.right;
               pointer.value = val;
            }else{ 
               pointer = pointer.right;
               compareins(val);
            }
        }else{
         pointer.value = val;
        
        }
      }    
     public void delete(int val){
      comparedel(val);
      if(found == false){
         System.out.println("Value Not Found");
         }else{
            found = false;
         }

     }
     public void comparedel(int val){
      
       if(pointer.value > val){
            if(pointer.left == null){
               
              }else{ 
               temp = pointer;
               pointer = pointer.left;
               comparedel(val);
            }
       }else if(pointer.value < val){
          if(pointer.right == null){
               
            }else{ 
               temp = pointer;
               pointer = pointer.right;
               comparedel(val);
            }
        }else{
         found = true;
         if(pointer == root){
            temp = pointer.left;
            temp.right = pointer.right;
            root = temp;
            pointer = root;
         }else{
            if(temp.left == pointer){
            temp.left = null;
            }else{
             temp.right = null;
            }
                 
             
       }
    }
          }
    public void dumptree(){
      if(check == true){
      System.out.println("    |" + root.value + "|      ");
      System.out.println("   /    \\    ");
      pointer = root.left;
      System.out.print(" |" + pointer.value + "| ");
      pointer = root.right;
      System.out.println("  |" + pointer.value + "|");
      System.out.println( "  /      /");
      pointer = root.left;
      pointer = pointer.left;
      System.out.print("|" + pointer.value + "|   ");
      pointer = root.right;
      pointer = pointer.left;
      System.out.println("|" + pointer.value + "|");
      System.out.println(" \\ ");
      pointer = root.left;
      pointer = pointer.left;
      pointer = pointer.right;
      System.out.println("  |" + pointer.value + "|");
      System.out.println("__________________________________________");
      }else{
      System.out.println("    |" + root.value + "|      ");
      System.out.println("   /    \\    ");
      pointer = root.left;
      System.out.print(" |" + pointer.value + "| ");
      pointer = root.right;
      System.out.println("  |" + pointer.value + "|");
      System.out.println( "  \\");
      pointer = root.left;
      pointer = pointer.right;
      System.out.println("   |"  + pointer.value + "|");
     

      }
      pointer = root;
       }

   
        
         
            
   
   
   

}