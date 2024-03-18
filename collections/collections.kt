class Comment(val userId:Int, val message:String)
fun main()
{
    var comments=listOf(Comment(5241,"Nice Code"),Comment(6621, "LIke it"))
    print(comments)

}