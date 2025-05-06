export function acronym(sentence) {
    const cleaned = sentence
      .replace(/[-_]/g, ' ')       // Hyphens and underscores → space
      .replace(/[^\w\s]/g, '');    // Remove other punctuation
  
    const words = cleaned.split(/\s+/);
    const acronym = words.map(word => word[0]?.toUpperCase()).join('');
  
    return acronym;
  }
  