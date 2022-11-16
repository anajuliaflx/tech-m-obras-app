import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';

function createData(
  nome: string,
  anoCostrucao: number,
  coordenacao: string,
  gerencia: string,
  diretoria: string,
  outorga: string,
  titularidade: string,
) {
  return { nome, anoCostrucao, coordenacao, gerencia, diretoria, outorga, titularidade };
}
const dateYear = new Date().getFullYear();
const rows = [
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael")
];

export default function TableConstruction() {
  return (
    <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} size="small" aria-label="a dense table">
        <TableHead>
          <TableRow>
            <TableCell>Nome </TableCell>
            <TableCell align="right">Ano</TableCell>
            <TableCell align="right">Cordenação</TableCell>
            <TableCell align="right">Gerencia</TableCell>
            <TableCell align="right">Diretoria</TableCell>
            <TableCell align="right">Outorga</TableCell>
            <TableCell align="right">Titularidade</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rows.map((row) => (
            <TableRow
              key={row.nome}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell component="th" scope="row">
                {row.nome}
              </TableCell>
              <TableCell align="right">{row.anoCostrucao}</TableCell>
              <TableCell align="right">{row.coordenacao}</TableCell>
              <TableCell align="right">{row.gerencia}</TableCell>
              <TableCell align="right">{row.diretoria}</TableCell>
              <TableCell align="right">{row.outorga}</TableCell>
              <TableCell align="right">{row.titularidade}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}