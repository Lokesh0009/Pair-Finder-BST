package com.gl.javafsd.pairfinderbst;

public class BinarySearchTreePairFinderTest {
	
	public static void main(String[] args) {
		
		test(120);
		test(70);
		test(500);

	}

	private static void test(int sum) {
		
		BinarySearchTree tree = sample1();
		
		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(tree);
		
		finder.findPair(sum);

	}
	
	private static BinarySearchTree sample1() {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		
		return tree;
	}

}
