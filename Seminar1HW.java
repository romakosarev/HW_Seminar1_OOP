package Seminar1;

public class Seminar1HW {

    static int i = 10;

    static class Tree{
        char val;
        Tree[] child = new Tree[i];

        Tree(char Branch){
            val = Branch;
            for (int a = 0; a < i; a++)
                child[a] = null;
        }
    }

    static void PrintChild(Tree root, char Branch, int chain){
        if (root.val == Branch){
            if(root.child[chain-1] == null)
                System.out.println("Error\n");
            else
                System.out.println(root.child[chain-1].val + "\n");
        }

        for (int a = 0; a < i; a++)
            if (root.child[a] != null)
                PrintChild(root.child[a], Branch, chain);
    }
    public static void main(String[] args){
        Tree root = new Tree('A');
        root.child[0] = new Tree('B');
        root.child[1] = new Tree('C');
        root.child[2] = new Tree('D');
        root.child[3] = new Tree('E');
        root.child[0].child[0] = new Tree('F');
        root.child[0].child[1] = new Tree('G');
        root.child[2].child[0] = new Tree('H');
        root.child[0].child[0].child[0] = new Tree('I');
        root.child[0].child[0].child[1] = new Tree('J');
        root.child[0].child[0].child[2] = new Tree('K');
        root.child[2].child[0].child[0] = new Tree('L');
        root.child[2].child[0].child[1] = new Tree('M');

        char Branch = 'A';
        System.out.print("Первый ребенок А: ");
        PrintChild(root, Branch, 1);

        Branch = 'B';
        System.out.print("Второй ребенок B: ");
        PrintChild(root, Branch, 2);

        Branch = 'F';
        System.out.print("Седьмой ребенок F: ");
        PrintChild(root, Branch, 7);
    }

}



