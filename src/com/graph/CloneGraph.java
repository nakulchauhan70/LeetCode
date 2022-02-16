package com.graph;


import com.Node;

import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Queue<Node> queue = new ArrayDeque<>();
        Map<Node, Node> map = new HashMap<>();

        queue.add(node);
        map.put(node, new Node(node.val, new ArrayList<>()));

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            for (Node neighbor : poll.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }

                map.get(poll).neighbors.add(map.get(neighbor)); // keep updating 1st Node's value in arraylist
            }
        }

        return map.get(node);
    }
}
