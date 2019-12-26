'''
Elizabeth Brighton
Evaluation Assignment (Python)
Find.py
'''
import os
from CreateAST.Create import *


'''
FindClass
This Class takes a directory as an argument and searches
through the directory and subdirectories to find .py
files and create AST's for each
'''
class FindClass:
    count = 0
    create = CreateClass()

    '''
    init
    Set count to 0 and create a CreateClass instance
    '''
    def __init__(self):
        self.count = 0
        self.create = CreateClass()

    '''
    searchDir
    Searches through all files in the directory (including sub Directories)
    and sends all that end with .py to the CreateClass.createAST function
    '''
    def searchDir(self, dirName):
        #os.walk() returns all files (even ones in sub Directories)
        #therefore no recursion is needed - only the full path must be
        #sent to the create.createAST function
        exists = False
        for root, dirs, files in os.walk(dirName):
            exists = True
            for file in files:
                if file.endswith(".py"):
                    self.count = self.count + 1
                    #print(os.path.join(root, file))
                    self.create.createAST(os.path.join(root, file))
        if not exists:
            print("No Directory found")

    '''
    returnCount
    Returns the number of .py files found
    '''
    def returnCount(self):
        return self.count
