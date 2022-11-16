import React from "react";

export default function Footer({ style }: { style: string }) {
   return(
      <footer className={style}>
      <a>
            &copy; {new Date().getFullYear()} Rafel Tomás. Todos os direitos reservados.
      </a>
      </footer>
   )
}

