'''
Elizabeth Brighton
Evaluation Assignment (Python)
test.py
'''

import os

import FindAST.Find
import CreateAST.Create

import unittest


'''
TestCases
This Class is for testing purposes. It uses the python unit
test version unittest. I thought it would be easier to have
the find and create tests within the same file so they
are sectioned off by comments. Before each test the setUp 
is run which resets both the FindClass and the CreateClass
regardless of the test
'''
class TestCases(unittest.TestCase):
    find = FindAST.Find.FindClass()
    create = CreateAST.Create.CreateClass()

    def setUp(self):
        self.find = FindAST.Find.FindClass()
        self.create = CreateAST.Create.CreateClass()


    '''
    FindAST TESTS
    '''
    def test_ComplexFile(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/RegexTest')
        self.find.searchDir(filename)
        self.assertEqual(self.find.returnCount(), 4)

    def test_FileDoesNotExist(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/DoesNotExist')
        self.find.searchDir(filename)
        self.assertEqual(self.find.returnCount(), 0)

    def test_SimpleFile(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/SimpleTest')
        self.find.searchDir(filename)
        self.assertEqual(self.find.returnCount(), 1)

    '''
    CreateAST TESTS
    '''
    def test_CreateSimpleAST(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/CreateAST/Main.py')
        self.create.createAST(filename)
        self.assertTrue(True)

    def test_CreateComplexAST(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/CreateAST/Complex.py')
        self.create.createAST(filename)
        self.assertTrue(True)

    def test_CreateDoesNotExistAST(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/CreateAST/DoesNotExist.py')
        self.create.createAST(filename)
        self.assertTrue(True)

    def test_CreateBlankAST(self):
        dirName = os.path.dirname(__file__)
        filename = os.path.join(dirName, '../static/PythonTestFiles/CreateAST/Blank.py')
        self.create.createAST(filename)
        self.assertTrue(True)



'''
Main function
This function calls the TestCases class by 
using the python method for calling unit tests,
unittest.main()

'''
if __name__ == '__main__':
    unittest.main()

