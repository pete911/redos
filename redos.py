import time
import re

def redos(data):
    start = time.time()
    regex = re.compile("^(a+)+$")
    regex.match(data)
    end = time.time() - start
    print("%f" % end)

if __name__ == '__main__':
    data = raw_input("Type 'aaaaaaaaaaaaaaaaaaa!' ")
    redos(data)
