/**
 * Created by cnapoles on 6/6/17.
 */
class RangeLists{
    static void main(String[] args){

        def range = [32,24,36,14,5,7,8,4,11,10] as SortedSet
        println(range)
        println range.class.name
       println range.drop(4)

        Collection strings = 'this is a list of strings'.split()
        println(strings)

        Date date = new Date()
        println(date - 1)
    }
}