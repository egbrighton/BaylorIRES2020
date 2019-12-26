'''
Elizabeth Brighton
Evaluation Assignment (Python)
Create.py
'''
import ast

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

            # create an ASTfile
            ASTfile = ast.parse(f.read())
            f.close()
        except IOError:
            print("Does Not Exist")
            exists = False


        if exists:
            #rename the fileName given
            pyName = pyName + ".ast"
            #open the .ast file for writing
            f = open(pyName, "w")
            #dump the ASTfile into the file
            f.write(ast.dump(ASTfile))
            f.close()





