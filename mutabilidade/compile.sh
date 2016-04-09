echo Compilando ...
rm -rf bin # no windows rd /s/q bin
mkdir bin
javac -cp bin -d bin src/banco/*.java
javac -cp bin -d bin src/teste/*.java
javac -cp bin -d bin src/cobaia/*.java
# no windows é \
