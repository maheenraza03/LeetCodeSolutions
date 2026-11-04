// Online JavaScript compiler (editor)
// Write and run JavaScript online using this JS editor.

function passwordGenerator(length) {

  function generateChar() {
    const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    const randomIndex = Math.floor(Math.random() * chars.length);
    return chars.charAt(randomIndex);
  }

  let password = "";

  for (var i = 0; i < length + 1; i++) {
    let char = generateChar();
    password += char;
  }

  return password;
  
}

console.log(passwordGenerator(8));