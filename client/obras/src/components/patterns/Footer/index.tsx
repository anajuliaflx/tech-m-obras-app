import React from "react";

export default function Footer({ style }: { style: string }) {
   return(
      <footer className={style}>
      <a>
            &copy; {new Date().getFullYear()} Obras. Todos os direitos reservados.
      </a>
      </footer>
   )
}

