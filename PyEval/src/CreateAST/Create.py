'''
Elizabeth Brighton
Evaluation Assignment (Python)
Create.py
'''
import sys
import ast
from pprintast import pprintast as ppast

'''
CreateClass
This class creates an AST file using the ast library
'''
class CreateClass:

    '''
    createAST
    This function receives a .py file as input and produces an AST file
    which is stored in the same location as the file given
    '''
    def createAST(self, pyName):
        exists = True
        
        try:
            # open the file for reading
            f = open(pyName, "r")
            #read the .py file into a string
            tempStr = f.read()
            
            # create an ASTfile - This is no longer needed
            #ASTfile = ast.parse(str)
            
            f.close()
        except IOError:
            print("Does Not Exist")
            exists = False


        if exists:
            #rename the fileName given
            pyName = pyName + ".ast"
            #open the .ast file for writing
            f = open(pyName, "w")
            
            #dump the ASTfile into the file - found an pretty version using pprintast
            #f.write(ast.dump(ASTfile, True, include_attributes=True))
            
            #direct sys.stdout to the file and print the AST using ppast
            normalOut = sys.stdout
            sys.stdout = f
            #print the string converted to an AST to the file
            ppast(tempStr)
            
            #redirect the stdout back to what it was before
            sys.stdout = normalOut
            f.close()
            

           

