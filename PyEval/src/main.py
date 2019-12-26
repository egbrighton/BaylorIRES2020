'''
Elizabeth Brighton
Evaluation Assignment (Python)
main.py
'''

import FindAST.Find
import sys


'''
Main Function
This function accepts an argument from the
command line and calls the FindClass in order
to find all the .py files and create an AST for each
'''
if __name__ == '__main__':
    #Find and check the number of argmuents given through the command line
    numArgs = len(sys.argv) - 1
    if numArgs == 1:
        #Create and call the FindClass
        find = FindAST.Find.FindClass()
        find.searchDir(sys.argv[1])

    else:
        print("Usage: DirectoryName")
