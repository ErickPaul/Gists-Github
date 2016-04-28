import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Any additional imports may be added here */

class Node {
    public int value;

    public Node(int value)
    {
        this.value = value;
    }
}

class NodeList extends ArrayList<Node>
{
    
    public void add(int value){
        this.add(0);
    }
    
}

public class Solution {
    public static void main(String[] args) {
        String[] vals = {"4", "5", "1"};

        NodeList list = new NodeList();
        for(String val : vals)
        {
            list.add(new Node(Integer.parseInt(val)));
        }

        for(Node node : list)
        {
            System.out.println(node.value);
        }
    }
}