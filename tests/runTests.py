from pathlib import Path
from typing import List
import subprocess


class TestException(Exception):
    """Personalized Exception for running the tests"""

    def __init__(self, *args, **kwargs) -> None: return super().__init__(*args, **kwargs)


class Const:
    """Define constants to the Main class"""

    ROOT: Path = Path(__file__).parent.parent / "src"

    TESTFILE: Path = ROOT / "Test.java"

    COMMAND: List[str] = ["java", "Test.java"]


class Main:
    """Main class to init the java class that runs the tests"""

    def __init__(self) -> None:

        self.const = Const()

    
    def run(self) -> None:

        root, testfile, command = self.const.__dict__.values()

        try:

            if testfile.exists():

                try:
            
                    subprocess.run(command, cwd=root)
                
                except subprocess.CalledProcessError as e:

                    raise TestException(f"Error while executing {testfile} in subprocess.run: {e}")
                
                except Exception as e:

                    raise TestException(f"Unknown error while executing {testfile}: {e}")

            else:

                raise TestException(f"Test.java not found in {testfile}")
        
        except TestException as e:

            print("Error while trying to execute tests in Main.run")

            raise e
        
        except Exception as e:

            print("Unknown error while trying to execute tests in Main.run")

            raise e
        