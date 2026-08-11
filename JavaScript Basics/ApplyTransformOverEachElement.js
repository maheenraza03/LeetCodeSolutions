/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const functionApplied = [];
    for (let i = 0; i < arr.length; i++) {
        functionApplied.push(fn(arr[i], i));
    }
    return functionApplied;
};