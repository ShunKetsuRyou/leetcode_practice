class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val pre = ListNode(-1)
        var tail = pre
        var tmp = 0
        var p1 = l1
        var p2 = l2
        while(p1 != null || p2 != null){
            var v1 = 0
            var v2 = 0
            if(p1 != null){
                v1 = p1.`val`
                p1 = p1.next
            }
            if(p2 != null){
                v2 = p2.`val`
                p2 = p2.next
            }
            val nextNode = ListNode((v1 + v2 + tmp) % 10)
            tmp = (v1 + v2 + tmp) / 10
            tail.next = nextNode
            tail = tail.next
        }
        if(tmp > 0){
            val nextNode = ListNode(tmp)
            tail.next = nextNode
        }
        return pre.next
    }
}
