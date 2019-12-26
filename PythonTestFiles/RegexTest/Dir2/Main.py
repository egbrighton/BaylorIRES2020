import sys
from FindPythonFile.Find import *

if __name__ == '__main__':
    
    numArgs = len(sys.argv) - 1
    if numArgs == 1:
        
        print("File Given: ")
        print(sys.argv[1])
        
        find = Find()
        find.searchDir(sys.argv[1])
    else:
        print("Usage: DirectoryName")  