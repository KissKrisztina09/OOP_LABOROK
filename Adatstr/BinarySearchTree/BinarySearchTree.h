//
// Created by Bibi on 4/30/2021.
//

#ifndef BINARYSEARCHTREE_BINARYSEARCHTREE_H
#define BINARYSEARCHTREE_BINARYSEARCHTREE_H

typedef struct {
    int info;
    struct root *left;
    struct root *right;
}root;

root *create ();
root destroy(root**);
void insert (root**, int);
void inorder(root*);
void preorder(root*);
void postorder(root*);
root *Delete(root**, int);
root *Find(root*, int);
#endif //BINARYSEARCHTREE_BINARYSEARCHTREE_H
