fun main()
{
    val weekday="Friday"
    val hour=20
    val isOpen=when(weekday){
        "Monday"->hour>=8 && hour <=12
        "Tuesday"->hour>=8 && hour <=18
        "Wednesday"->hour>=8 && hour <=18
        "Thursday"->hour>=8 && hour <=18
        "Friday"->hour>=8 && hour <=21
        "Saturday"->hour>=9 && hour <=16
        else-> hour>=8 && hour <=16
    }
    if(isOpen==true) println("Restaurant is open")
}