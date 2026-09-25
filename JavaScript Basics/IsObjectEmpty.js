/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    // variable to store returning boolean
    let objectEmpty = false;

    // check if the string version of the JSON object is empty & check if the number of keys is 0
    if (JSON.stringify(obj) === '{}' || Object.keys(obj).length === 0) {
        objectEmpty = true;
    }

    return objectEmpty;
};