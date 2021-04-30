//
// Created by Bibi on 4/30/2021.
//
#include <emmintrin.h>
#include "BinarySearchTree.h"

root *create (){
    root *ag;
    ag =(root*)(malloc(1*sizeof(root)));
    if(!ag){
        printf("Sikertelen lefoglalas!");
        return 0;
    }
    ag->left = NULL;
    ag->right = NULL;
    return ag;
}

void insert (root** fa, int a){
    if((*fa)==NULL){
        (*fa) == create();
        (*fa) ->info = a;
    }else{
        if((*fa)->info > a){
            insert(&((*fa)->left), a);
        }else if((*fa)->info < a){
            insert(&((*fa)->right), a);
        }
    }
}

void inorder(root *fa){
    if(fa->left) {
        inorder(fa->left);
    }
    printf("%3d ", fa->info);
    if(fa->right) {
        inorder(fa->right);
    }
}

void preorder(root *fa){
    printf("%3d", fa->info);
    if(fa->left){
        preorder(fa->left);
    }
    if(fa->right){
        preorder(fa->right);
    }
}

void postorder(root* fa){
    if(fa->left){
        postorder(fa->left);
    }
    if(fa->right){
        postorder(fa->right);
    }
    printf("%3d", fa->info);
}




















