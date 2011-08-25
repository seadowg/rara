# rara

## Description

Scala is kinda awesome and I really like using it as a bigger, faster brother to Ruby. While I'm doing this though I don't
want to have to use 'toString()' instead of 'to_s' - that would be silly. 

'rara' will allow you to use some of the standard Ruby object and string methods to call Scala's equivalents. This will allow you to annoy industrialists by putting underscores everywhere instead of camel casing.

## Use

To get the library you can either download the .jar from the Github (/oetzi/rara) or package the source. To use the current build
file you'll need to have buildr installed.

Once you've got it you can add the jar as a dependency to your project and simply import with:

    import com.github.oetzi.rara.Rara._
    
Currently available functions are documented at https://github.com/oetzi/rara/wiki/Functions-Guide