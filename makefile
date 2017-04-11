output = ./bin
lib = ./bin:./lib/*
system = ./source/*.java
unitTest = ./test/*


all: unitTest

system:
	mkdir -p bin
	javac -g -d $(output) $(system)

unitTest: system
	javac -g -cp $(lib) -d $(output) $(unitTest)

run:
	java -cp $(lib) org.junit.runner.JUnitCore test.SeatUnitTest