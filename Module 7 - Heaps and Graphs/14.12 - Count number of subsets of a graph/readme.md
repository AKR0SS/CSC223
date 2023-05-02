# 14.12 NVCC Lab: Count number of subsets of a graph

A graph is made up of a set of nodes called vertices and a set of lines called edges that connect the nodes. Informally, a connected component of a graph is a subset in which each pair of nodes is connected with each other via a path. For example, the following graph consists of two connected components (subsets).

![](https://github.com/cui9901/zybook/blob/82547b68668f6a13c88341b49525d1da20d47347/graph1.png?raw=true)

For this assignment, you are required to find out the number of connected components in a graph as specified below:

implement the following method:

public static int countConnectedComponents(String fileName): where fileName is the input data file representing a graph: each line in the data file contains two numbers representing a pair of vertices that are connected (an edge between these two nodes exists). For example, given the following data file:
```
1  2
1  3
2  3
4  5
6  8
6  7
```
Calling countConnectedComponents should return 3, because there are three connected components in the graph as shown below:

![](https://github.com/cui9901/zybook/blob/main/graph2.png?raw=true)
