
all: babel

babel:
	./org-babel-tangle.sh meta-programming.org

clean:
	rm -f example_*
	rm -f *Example.java
	rm -f *.class

