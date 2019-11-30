/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution
{
public:
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2)
    {
        ListNode *head = NULL;
        ListNode *tail = NULL;
        while (l1 != NULL && l2 != NULL)
        {
            ListNode *rm = NULL;
            if (l1->val <= l2->val)
            {
                rm = l1;
                l1 = l1->next;
                rm->next = NULL;
            }
            else if (l1->val > l2->val)
            {
                rm = l2;
                l2 = l2->next;
                rm->next = NULL;
            }
            if (head == NULL)
            {
                head = tail = rm;
            }
            else
            {
                tail->next = rm;
                tail = rm;
            }
        }
        if (l1 != NULL)
        {
            if (head == NULL)
            {
                head = l1;
            }
            else
            {
                tail->next = l1;
            }
        }
        else if (l2 != NULL)
        {
            if (head == NULL)
            {
                head = l2;
            }
            else
            {
                tail->next = l2;
            }
        }
        return head;
    }
};