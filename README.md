AbsoluteValuesSumMinimization:Given a sorted array of integers a, your task is to determine which element of a is closest to all other values of a. In other words, find the element x in a, which minimizes the following sum:abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)

AddBorder: Given a rectangular matrix of characters, add a border of asterisks(*) to it.

AllLongestString: Given an array of strings, return another array containing all of its longest strings.

ArrayChange: You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

AvoidObstacles: You are given an array of integers representing coordinates of obstacles situated on a straight line.
Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.
Find the minimal length of the jump enough to avoid all the obstacles.

BoxBlur: Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.
Return the blurred image as an integer, with the fractions rounded down.

BuildPolindrome: Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

ChessBoardCellColor: Given two cells on the standard chess board, determine whether they have the same color or not.

ChessKnight: Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.

CommonChracterCount: Given two strings, find the number of common characters between them.

DeleteDigit: Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

DifferentSquares; Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

DigitDegree: Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.Given an integer, find its digit degree.

DigitsProduct: Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.
Example
For product = 12, the output should be
solution(product) = 26;
For product = 19, the output should be
solution(product) = -1.

ElectionsWinners: Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.
The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.

EvenDigitOnly: Check if all digits of the given integer are even.
Example
For n = 248622, the output should be
solution(n) = true;
For n = 642386, the output should be
solution(n) = false.

ExtractEachKth: Given array of integers, remove each kth element from it.
Example
For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

FileNaming: You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.
Return an array of names that will be given to the files.

