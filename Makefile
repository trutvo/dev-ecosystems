
all: babel
	python example_meta_programming.py

babel:
	./org-babel-tangle.sh meta-programming.org
