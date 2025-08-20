public class Alphabetposition {
    function alphabetPosition(text) {
  let result = [];
  const lowerCaseText = text.toLowerCase();
  
  for (let i = 0; i < lowerCaseText.length; i++) {
    const char = lowerCaseText[i];
    if (char >= 'a' && char <= 'z') {
      const position = char.charCodeAt(0) - 'a'.charCodeAt(0) + 1;
      result.push(position);
    }
  }
  
  return result.join(' ');
}
    
}

