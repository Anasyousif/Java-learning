const gameArea = document.getElementById('gameArea');
const ball = document.getElementById('ball');

const gameWidth = gameArea.clientWidth;
const gameHeight = gameArea.clientHeight;
const ballSize = gameWidth * 0.04; // 4% of width

// Set initial position at bottom center
let x = gameWidth / 2 - ballSize / 2;
let y = gameHeight - ballSize - 1;

// Increased speed (pixels per frame)
let dx = 3;
let dy = -3;

ball.style.width = `${ballSize}px`;
ball.style.height = `${ballSize}px`;

// Game loop
function gameLoop() {
  x += dx;
  y += dy;

  // Bounce off walls
  if (x <= 0 || x + ballSize >= gameWidth) {
    dx = -dx;
  }
  if (y <= 0 || y + ballSize >= gameHeight) {
    dy = -dy;
  }

  ball.style.left = `${x}px`;
  ball.style.top = `${y}px`;

  requestAnimationFrame(gameLoop);
}

requestAnimationFrame(gameLoop);
